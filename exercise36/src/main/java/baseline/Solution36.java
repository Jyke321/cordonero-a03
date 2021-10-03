package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

import java.util.ArrayList;
import java.util.Scanner;

/*
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
        ArrayList<Integer> array = new ArrayList<>();
        StatisticsHandler stats = new StatisticsHandler();
        String input = "";
        //make a loop to get input from user that stops when "done" is inputted
        while (input.compareTo("done")!=0) {
            System.out.print("Enter a number: ");
            input = in.nextLine();
            //validate if input is a number, if so add to list
            if (stats.validateInputIsNumber(input))
                array.add(Integer.parseInt(input));
        }
        //calculate the average, max, min, and std with statisticsHandler
        double average = stats.average(array);
        int max = stats.max(array);
        int min = stats.min(array);
        double std = stats.std(array);
        //print out the array
        int i=0;
        for (Integer number:array) {
            if (i<1)
                System.out.print("Numbers: " + number);
            else
                System.out.print(", " + number);
            i++;
        }
        //display the average, max, min, and std with statisticsHandler
        System.out.println("\nThe average is "+ average +"\n" +
                "The minimum is "+min+"\n" +
                "The maximum is "+max+"\n" +
                "The standard deviation is " + std);
    }
}
