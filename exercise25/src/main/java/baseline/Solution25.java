package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

//Create a program that determines the complexity of a given password based on these rules:
//
//A very weak password contains only numbers and is fewer than eight characters.
//A weak password contains only letters and is fewer than eight characters.
//A strong password contains letters and at least one number and is at least eight characters.
//A very strong password contains letters, numbers, and special characters and is at least eight characters.
//If a password does not meet any of these rules, then report it as a password of unknown strength.

import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //get user input from a function
        //get an int indicating password strength from the passwordValidator function
        //convert the integer to a string passwordStrength
        //display "The password 'password' is a _(passwordStrength)_ password
    }

    private String getUserInput() {
        //prompt user for a password and return it
    }
    public static int passwordValidator(String password) {
        //make a variable to hold the return value and initialize it to 0 (yes this how I actually think)
        //create variable for number of characters
        //figure out what password has i.e. numbers,characters, etc and flag them with booleans
        //use if statements to decipher password strength
        //return the password strength as a number from 0-4
    }
}
