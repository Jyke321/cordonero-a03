package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

/*
Arrays don’t have to be hard-coded.
You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing.
Prompt for names of contestants until the user leaves the entry blank.
Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.
Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data structure, like an ArrayList.
 */

import java.util.Scanner;

public class Solution35 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //create ArrayListManipulator object
        ArrayListManipulator list = new ArrayListManipulator();
        //start a loop that ends when user inputs ""
        String input = " ";
        while (!input.isEmpty()) {
            //prompt the user for a name
            System.out.print("Enter a name: ");
            input = in.nextLine();
            //add it to the array list
            list.addToArrayList(input);
        }
        //pick a winner with object
        System.out.println("The winner is... " + list.pickWinnerFromArrayList() + ".");
    }
}
