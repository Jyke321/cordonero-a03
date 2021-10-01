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
    static Solution25 app = new Solution25();

    public static void main(String[] args) {
        //get password form user input
        String password = app.getUserInput();
        //get an int indicating password strength from the passwordValidator function
        int passwordStrength = app.passwordValidator(password);
        //convert the integer to a string passwordStrength
        String buffer = switch (passwordStrength) {
            case 1 -> "very weak password.";
            case 2 -> "weak password.";
            case 3 -> "strong password.";
            case 4 -> "very strong password.";
            default -> "password of unknown strength.";
        };
        //display "The password 'password' is a _(passwordStrength)_ password
        System.out.println("The password '" + password + "' is a " + buffer);
    }

    private String getUserInput() {
        System.out.print("Enter a password: ");
        return in.nextLine();
    }
    public int passwordValidator(String password) {
        //make a variable to hold the return value and initialize it to 0 (yes this how I actually think)
        int retVal = 0;
        //create variable for number of characters
        int numChar = password.length();
        //figure out what password has i.e. numbers,characters, etc. and flag them with booleans
        boolean hasNumbers = password.matches(".*\\d.*");
        boolean hasCharacters = password.matches(".*[a-zA-Z].*");
        boolean hasSpecialCharacters = password.matches(".*\\W.*");
        //use if statements to decipher password strength
        if (hasNumbers)
            retVal += 1;
        if (hasCharacters)
            retVal += 2;
        if (retVal == 3 && numChar<8)
            retVal = 2;
        if (retVal==3 && hasSpecialCharacters)
            retVal = 4;
        //return the password strength as a number from 0-4
        return retVal;
    }
}
