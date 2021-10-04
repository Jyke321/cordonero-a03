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
Many languages can easily convert strings to array with a built-in function
that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this.
The function takes in the original array and returns the new array.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution38 {
    private static final Scanner in = new Scanner(System.in);
    //I admit I am an idiot... my parents give me a bedtime since I live with them,
    //and I've been procrastinating a fair bit because I struggle to stay focused,
    //and now it's 9:26 and IDK ig I can finish this, so I've given up on test cases
    //I regret joining that game jam now, I regret joining a projects team for knight hacks,
    //I regret not realizing I had "General Conference" this weekend for my religion which
    //I'm not allowed to skip out on since I live at home with family.
    //I also lost two hours friday night since we had the missionaries over.
    //now I remember we also had them over the previous saturday night.
    //I really just haven't planned my time well at all it seems
    //sorry for ranting, but I really need to lower my stress level as I only have 2 and a half hours left if my dad will even let me
    public static void main(String[] args) {
        Solution38 sol = new Solution38();
        //prompt user for list and store it in a string
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = in.nextLine();
        //send string to function to convert it to an array list
        List<Integer> array = sol.getArrayFromString(input);
        //send the array to filterEvenNumbers
        array = sol.filterEvenNumbers(array);
        //display the even numbers
        System.out.print("The even numbers are");
        for (Integer number:array) {
            System.out.print(" " + number);
        }
        System.out.println(".");
    }

    public List<Integer> getArrayFromString(String input) {
        //loop through the length of the string going character by character
        //append a new string whenever there isn't white space, and add it to list when there is white space
        StringBuilder number = new StringBuilder();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i<input.length();i++) {
            if(Character.isDigit(input.charAt(i)))
                number.append(input.charAt(i));
            else if (!number.isEmpty()) {
                array.add(Integer.parseInt(String.valueOf(number)));
                number.delete(0,number.length());
            }
        }
        if (!number.isEmpty()) {
            array.add(Integer.parseInt(String.valueOf(number)));
            number.delete(0, number.length());
        }
        return array;
    }

    public List<Integer> filterEvenNumbers(List<Integer> originalArray) {
        //create a new array list
        ArrayList<Integer> newArray = new ArrayList<>();
        //loop through original list and add the even numbers to the new one
        for (Integer number:originalArray) {
            if (number%2==0)
                newArray.add(number);
        }
        //return the new list
        return newArray;
    }
}
