package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution28 {
    private static final Scanner in = new Scanner(System.in);
    static Solution28 sol = new Solution28();

    public static void main(String[] args) {
        //create an array list to store the 5 numbers
        ArrayList<Integer> fiveNumbers = new ArrayList<>();
        //use a loop to request the data for each array element
        // from the user via a function
        for (int i=0; i<5; i++)
            fiveNumbers.add(i,sol.getNumberFromUser());
        //send the array list to a function to get the sum
        int sum = sol.getSumFromArrayList(fiveNumbers);
        //print the sum
        System.out.println("The total is " + sum + ".");
    }

    private int getNumberFromUser() {
        System.out.print("Enter a number: ");
        return Integer.parseInt(in.nextLine());
    }
    public int getSumFromArrayList(List<Integer> array){
        int sum = 0;
        for (int i=0; i<5; i++) {
            sum += array.get(i);
        }
        return sum;
    }
}
