package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

/*
Sometimes input you collect will need to be filtered down.
Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.
Constraints
Convert the input to an array.
Many languages can easily convert strings to arrays with a built-in function
that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this.
The function takes in the original array and returns the new array.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt user for list and store it in a string

        //send string to function to convert it to an array list

        //send the array to filterEvenNumbers

        //display the even numbers

    }

    public ArrayList<Integer> getArrayFromString(String input) {
        //loop through the length of the string going character by character
        //append a new string whenever there isn't white space, and add it to list when there is white space

        return new ArrayList<>();
    }

    public ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> originalArray) {
        //create a new array list

        //loop through original list and add the even numbers to the new one

        //return the new list
        return new ArrayList<>();
    }
}
