package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

//Write a program that will help you determine how many months it will take to pay off a credit card balance.
//The program should ask the user to enter the balance of a credit card,
//the APR of the card, and their monthly payment.
//The program should then return the number of months needed (rounded up to the next integer value).
//  The formula for this is
//n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
public class Solution26 {
    private static final Scanner in = new Scanner(System.in);
    static Solution26 sol = new Solution26();

    public static void main(String[] args) {
        //create a credit card object to store the input retrieved from the user (input received from a function)
        PaymentCalculator object = sol.getUserInput();
        //display the months to pay off the card using the PaymentCalculator class calculateMonths... method
        System.out.println("It will take you "+ object.calculateMonthsUntilPaidOff() +" months to pay off this card.");
    }
    private PaymentCalculator getUserInput() {
        //get user input and return it a PaymentCalculator object
        double balance;
        double apr;
        double monthlyPayment;
        System.out.print("What is your balance? ");
        balance = in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = in.nextDouble();
        return new PaymentCalculator(balance, apr, monthlyPayment);
    }
}
