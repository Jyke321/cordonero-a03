package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

/*
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate, so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate.
Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm
Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers.
Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.
 */

import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    static Solution31 sol = new Solution31();

    public static void main(String[] args) {
        //prompt user for age and resting heart rate

        //call a function that uses the age and resting heart rate
        //to create a chart of their heart rate based off of intensity

    }
    public void printOutKarvonenHeartRateCHart(int age, int heartRate) {
        //print the resting heart and age
        //print the top of the table with the label and "---------" lines

        //start the loop with initial value 55, condition until 95 or 100, and increment by 5

            //get the target heart rate from a function

            //print the intensity and target heart rate in the table format

    }

    public int getTargetHeartRate(int age, int heartRate, int intensity) {
        //use the formula TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        return 0;
    }
    private int getNumberFromUser(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return in.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a number.");
            }
        }
    } //I'm sorry it's really hard to not just fill getting input out
}
