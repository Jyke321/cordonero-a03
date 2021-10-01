package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    //create Scanner to take in user input
    private static final Scanner in = new Scanner(System.in);
    static Solution24 app = new Solution24();
    public static void main(String[] args) {
        //prompt the user for both input strings
        String[] userInput = app.getUserInput();

        //then display the output as shown in the example that follows
        //"note" and "tone" are anagrams **replace note and tone with user input**
        System.out.println("\"" + userInput[0] + "\" and \"" + userInput[1] + "\" are"
                + ((app.isAnagram(userInput[0], userInput[1])) ? " " : " not ") + "anagrams.");
    }

    private String[] getUserInput() {
        //create a string array to hold in the input
        String[] buffer = new String[2];
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n" +
                "Enter the first string: ");
        buffer[0] = in.nextLine();
        System.out.print("Enter the second string: ");
        buffer[1] = in.nextLine();
        return buffer;
    }

    public boolean isAnagram(String word1, String word2) {
        //determines if two words are anagrams of each other
        //first arrange both words in alphabetical order
        word1 = alphabetize(word1);
        word2 = alphabetize(word2);
        //then use string compare
        //if they are equal they are anagrams so return true
        //if they are not equal return false
        return word1.equals(word2);
    }
    public String alphabetize(String word) {
        char[] buffer = word.toCharArray();
        Arrays.sort(buffer);
        return String.valueOf(buffer);
    }
}
