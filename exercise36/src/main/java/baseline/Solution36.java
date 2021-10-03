package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Statistics is important in our field. When measuring response times or rendering times,
it’s helpful to collect data so you can easily spot abnormalities.
For example, the standard deviation helps you determine which values are outliers
and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time,
the maximum time, and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55
Constraints
Create functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */
public class Solution36 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //create an Array list of integers to hold user input

        //make a loop to get input from user that stops when "done" is inputted

            //validate if input is a number, if so add to list

        //calculate the average, max, min, and std with statisticsHandler

        //display the average, max, min, and std with statisticsHandler

    }
}
