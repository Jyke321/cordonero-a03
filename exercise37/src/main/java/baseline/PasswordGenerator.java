package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class PasswordGenerator {
    private static final Scanner in = new Scanner(System.in);
    //lists of characters the password generator may use
    private static char[] number = {'1','2','3','4','5','6','7','8','9'};
    private static char[] lowerCaseLetter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                        'o','p','q','r','s','t','u','v','w','x','y','z'};
    private static char[] upperCaseLetter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
            'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private static char[] specialCharacter = {'!','@','#','$','%','^','&','*','?','-','.',',','<','>',';',':'};
    //the string specifications
    private int minimumLength;
    private int specialCharacters;
    private int numberOfNumbers;

    PasswordGenerator() {
        //creates default settings for the password specifications
        minimumLength = 8;
        specialCharacters = 0;
        numberOfNumbers = 0;
    }

    public String passwordGenerator(){
        //uses stored values to generate a password
        /*
        current plan:
        loop for minimum length
            pick a random number to pick an array

            pick a random number to pick a random element from that list

         loop through remaining special characters and numbers if spots leftover
         */
        return "";
    }

    public void getUserInputForPasswordSpecifications() {
        //prompts user for minimum length and stores it

        //prompts user for special characters and stores it

        //prompts user for how many numbers and stores it

    }

}
