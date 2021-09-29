package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

/*
In previous programs, you asked the user for repeated input by writing the input statements multiple times.
But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.
Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
 */

import java.util.Scanner;

public class Solution28 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //create an array list to store the 5 numbers

        //use a loop to request the data for each array element
        // from the user via a function

        //send the array list to a function to get the sum
        //print the sum
    }

    private static int getNumberFromUser() {
        System.out.print("Enter a number: ");
        return Integer.parseInt(in.nextLine());
        //oops I did logic
    }
    public getSumFromArrayList(){
        //thinking about, I think array list already has a class for this,
        //if not this function can be useful
    }
    //seriously though, this exercises is either unusually easy or I'm going to mess up somewhere
}
