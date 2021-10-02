package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

/*
Write a Guess the Number game that has three levels of difficulty.
The first level of difficulty would be a number between 1 and 10.
The second difficulty set would be between 1 and 100.
The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game.
The computer picks a random number in that range and prompts the player to guess that number.
Each time the player guesses, the computer should give the player a hint as to whether
the number is too high or too low.
The computer should also keep track of the number of guesses.
Once the player guesses the correct number,
the computer should present the number of guesses and ask if the player would like to play again.

Example Output
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n
Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.
 */

import java.util.Scanner;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in);
    static Solution32 sol = new Solution32();

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        //start game loop
        while (true) {
            //prompt user for difficulty

            //set number to be guessed to random number within the range

            //initialize counter variable to 1

            //prompt user for first guess

            //use a loop to track repeated guesses
            while(true) {
                //break if they guess correct

                //increment guesses

                //prompt user for a guess and state whether they were high or low

            }
            //tell the user how many guesses it took

            //prompt the user if they wish to continue

            //break if they enter no
        }
    }
    private int getDifficultyFromUser() {
        //ask them for difficulty from 1 to 3
        //loop until they enter a valid number
        return 0;
    }
    private int getGuessFromUser() {
        //ask user for their guess and return it
        return 0;
    }
    public String getWhetherGuessIsLowHighOrSame(int guess, int actual) {
        //compare guess with actual
        return "";
    }
}
