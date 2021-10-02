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
Each time the player guesses, the computer should give the player a hint whether
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
import java.util.Random;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in);
    private static final Solution32 sol = new Solution32();
    private static final Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!\n");
        //start game loop
        boolean game = true;
        while (game) {
            //prompt user for difficulty
            int difficulty = sol.getDifficultyFromUser();
            //set number to be guessed to random number within the range
            int actual = sol.getRandomNumberToGuess(difficulty);
            //initialize counter variable to 1
            int numberOfGuesses = 1;
            //prompt user for first guess
            int guess = sol.getGuessFromUser();
            //use a loop to track repeated guesses
            while(true) {
                //break if they guess correct
                String result = sol.getWhetherGuessIsLowHighOrSame(guess,actual);
                if (result.compareTo("same")==0)
                    break;
                //increment guesses
                numberOfGuesses++;
                //prompt user for a guess and state whether they were high or low
                guess = sol.getGuessFromUser(result);
            }
            //tell the user how many guesses it took
            System.out.println("You got it in "+ numberOfGuesses +" guesses!\n");
            //prompt the user if they wish to continue
            //break if they enter no
            if ('n' == sol.getWhetherUserWantsToContinue())
                game = false;
        }
    }

    public int getRandomNumberToGuess(int difficulty) {
        return rand.nextInt((int) Math.pow(10,difficulty));
    }

    private char getWhetherUserWantsToContinue() {
        char retVal = '\0';
        while (!(retVal == 'y' || retVal == 'Y' || retVal == 'n' || retVal == 'N')) {
            System.out.print("Do you wish to play again (Y/N)? ");
            retVal = in.nextLine().charAt(0);
        }
        return Character.toLowerCase(retVal);
    }

    private int getDifficultyFromUser() {
        //ask them for difficulty from 1 to 3
        //loop until they enter a valid number
        int retVal;
        while (true) {
            try {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                retVal = Integer.parseInt(in.nextLine());
                sol.validateDifficultyInputtedFromUser(retVal);
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return retVal;
    }

    public void validateDifficultyInputtedFromUser(int retVal) throws IllegalArgumentException {
        IllegalArgumentException illArg = new IllegalArgumentException();
        if (retVal < 1 || retVal > 3) {
            throw (illArg);
        }
    }

    private int getGuessFromUser() {
        //ask user for their guess and return it
        System.out.print("I have my number. What's your guess? ");
        try {
            return Integer.parseInt(in.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }
    private int getGuessFromUser(String prompt) {
        //ask user for their guess and return it
        System.out.print("Too "+ prompt +". Guess again: ");
        try {
            return Integer.parseInt(in.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }
    public String getWhetherGuessIsLowHighOrSame(int guess, int actual) {
        //compare guess with actual
        if(guess<actual)
            return "low";
        else if (guess>actual)
            return "high";
        else
            return "same";
    }
}
