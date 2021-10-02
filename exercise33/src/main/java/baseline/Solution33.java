package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

/*
Arrays are great for storing possible responses from a program.
If you combine that with a random number generator,
you can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question and
then displays either "Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator.
Store the possible choices in a list and select one at random.
 */

import java.util.Scanner;

public class Solution33 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //prompt user for their question
        System.out.print("What's your question?\n> ");
        in.nextLine();
        //get response from magic eight-ball
        Magic8Ball eightBall = new Magic8Ball();
        System.out.println(eightBall.getEightBallFortune());
    }
}
