package baseline;

/*
Write a program that prompts for a first name, last name, employee ID, and ZIP code.
Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.
Constraints
Create a function for each validation rule.
Then create a validateInput function that takes in all of the input data and
invokes the specific validation functions.
Use a single output statement to display the outputs.
 */

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt the user for a first name, last name, employee id, and zipcode
        //get user input from a function for each data
        //call the validateInput function giving it all the data
        //print the String retrieved from validateInput
    }
    public static String validateInput(String firstName, String lastName, String employeeID,
                                     String zipCode) {
        //create a string to hold whether an error occurred
        //call the validateFirstName function and store whether there were any errors
        //call the validateLastName function and store whether there were any errors
        //call the validateEmployeeID function and store whether there were any errors
        //call the validateZipCode function and store whether there were any errors
        //if no errors occurred store "There were no errors found."
        //return the String
        return "There were no errors found.";
    }
    public static String validateFirstName (String name) {
        //create an empty string
        //determine if first name is empty
        //concatenate "The first name must be filled in." if there was an error
        //determine if first name is at least 2 characters
        //concatenate "The first name must be at least 2 characters long." if there was an error
        //return the concatenated string
        return "";
    }
    public static String validateLastName (String name) {
        //create an empty string
        //determine if last name is empty
        //concatenate "The last name must be filled in." if there was an error
        //determine if last name is at least 2 characters
        //concatenate "The first name must be at least 2 characters long." if there was an error
        //return the concatenated string
        return "";
    }
    public static String validateEmployeeId (String id) {
        //create an empty string
        //determine if employee id is in format AA-1234
        //concatenate "The employee ID must be in the format of AA-1234." if there was an error
        //return the concatenated string
        return "";
    }
    public static String validateZipCode (String zipCode) {
        //create an empty string
        //determine if the ZIP code is only numbers
        //determine if the ZIP code is 5 numbers long (length = 5)
        //concatenate "The zipcode must be a 5 digit number." if there was an error
        //return the concatenated string
        return "";
    }
}
