package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    private static final Scanner in = new Scanner(System.in);
    private static final Random rand = new Random();
    //lists of characters the password generator may use
    private static final char[] number = {'1','2','3','4','5','6','7','8','9'};
    private static final char[] lowerCaseLetter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                        'o','p','q','r','s','t','u','v','w','x','y','z'};
    private static final char[] upperCaseLetter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
            'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private static final char[] specialCharacter = {'!','@','#','$','%','^','&','*','?','-','.',',','<','>',';',':'};
    //the string specifications
    private int minimumLength;
    private int numberOfSpecialCharacters;
    private int numberOfNumbers;

    PasswordGenerator() {
        //creates default settings for the password specifications
        minimumLength = 8;
        numberOfSpecialCharacters = 0;
        numberOfNumbers = 0;
    }

    public String passwordGenerator(){
        //uses stored values to generate a password
        StringBuilder password = new StringBuilder();
        //loop for minimum length
        int index;
        for (int i = 0; i < minimumLength; i++) {
            //pick a random number to pick an array
            int characterArray = rand.nextInt(4);
            //pick a random number to pick a random element from that list
            switch (characterArray) {
                case 0 -> {
                    index = rand.nextInt(number.length);
                    password.append(number[index]);
                    numberOfNumbers--;
                }
                case 1 -> {
                    index = rand.nextInt(lowerCaseLetter.length);
                    password.append(lowerCaseLetter[index]);
                }
                case 2 -> {
                    index = rand.nextInt(upperCaseLetter.length);
                    password.append(upperCaseLetter[index]);
                }
                case 3 -> {
                    index = rand.nextInt(specialCharacter.length);
                    password.append(specialCharacter[index]);
                    numberOfSpecialCharacters--;
                }
                default -> {

                }
            }
        }
        //loop through remaining special characters and numbers if spots leftover
        while (numberOfSpecialCharacters>0) {
            index = rand.nextInt(specialCharacter.length);
            password.append(specialCharacter[index]);
            numberOfSpecialCharacters--;
        }
        while (numberOfNumbers>0) {
            index = rand.nextInt(number.length);
            password.append(number[index]);
            numberOfNumbers--;
        }
        return String.valueOf(password);
    }

    public void getUserInputForPasswordSpecifications() {
        //prompts user for minimum length and stores it
        System.out.print("What's the minimum length? ");
        minimumLength = Integer.parseInt(in.nextLine());
        //prompts user for special characters and stores it
        System.out.print("How many special characters? ");
        numberOfSpecialCharacters = Integer.parseInt(in.nextLine());
        //prompts user for how many numbers and stores it
        System.out.print("How many numbers? ");
        numberOfNumbers = Integer.parseInt(in.nextLine());
    }
}
