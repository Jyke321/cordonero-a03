package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution29 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //get user input and do math to it from a function
        int result = getRateFromUserInput();
        //print the result when valid
        System.out.println("It will take "+ result +" years to double your initial investment.");
    }
    public static int getRateFromUserInput() {
        //use a loop to get data from user and handle exceptions
        int input;
        while (true){
            try {
                //get user input and try to parse it
                System.out.print("What is the rate of return? ");
                input = Integer.parseInt(in.nextLine());
                //then try 72 / user input
                input = calculateYearsToDoubleInvestment(input);
                break;
            }
        //catch { literally any error, but mostly not integer input and divide by zero }
            catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        //return input if it's valid
        return input;
    }

    public static int calculateYearsToDoubleInvestment(int input) throws ArithmeticException {
        return 72 / input;
    }
}
