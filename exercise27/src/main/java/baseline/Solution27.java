package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt the user for a first name, last name, employee id, and zipcode
        //get user input from a function for each data
        String firstName = getUserInput("Enter the first name: ");
        String lastName = getUserInput("Enter the last name: ");
        String zipCode = getUserInput("Enter the ZIP code: ");
        String employeeID = getUserInput("Enter the employee ID: ");
        //call the validateInput function giving it all the data
        String buffer = validateInput(firstName,lastName,zipCode,employeeID);
        //print the String retrieved from validateInput
        System.out.println(buffer);
    }
    private static String getUserInput(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }
    public static String validateInput(String firstName, String lastName,
                                       String zipCode, String employeeID) {
        //create a string to hold whether an error occurred
        String buffer = "";
        //call the validateFirstName function and store whether there were any errors
        buffer += validateFirstName(firstName);
        //call the validateLastName function and store whether there were any errors
        buffer += validateLastName(lastName);
        //call the validateZipCode function and store whether there were any errors
        buffer += validateZipCode(zipCode);
        //call the validateEmployeeID function and store whether there were any errors
        buffer += validateEmployeeId(employeeID);
        //if no errors occurred store "There were no errors found."
        //return the String
        if (buffer.compareTo("") == 0)
            buffer = "There were no errors found.";
        return buffer;
    }
    public static String validateFirstName (String name) {
        //create an empty string
        String buffer = "";
        //determine if first name is at least 2 characters
        //concatenate "The first name must be at least 2 characters long." if there was an error
        if (name.length()<2)
            buffer += "The first name must be at least 2 characters long.\n";
        //determine if first name is empty
        //concatenate "The first name must be filled in." if there was an error
        if (name.compareTo("")==0) {
            buffer += "The first name must be filled in.\n";
        }
        //return the concatenated string
        return buffer;
    }
    public static String validateLastName (String name) {
        //create an empty string
        String buffer = "";
        //determine if last name is empty
        //concatenate "The last name must be filled in." if there was an error
        if (name.length()<2)
            buffer += "The last name must be at least 2 characters long.\n";
        //determine if last name is at least 2 characters
        //concatenate "The first name must be at least 2 characters long." if there was an error
        if (name.compareTo("")==0) {
            buffer += "The last name must be filled in.\n";
        }
        //return the concatenated string
        return buffer;
    }
    public static String validateEmployeeId (String id) {
        //create an empty string
        String buffer = "";
        //determine if employee id is in format AA-1234
        //concatenate "The employee ID must be in the format of AA-1234." if there was an error
        if (    (id.length() != 7) ||
                !Character.isLetter(id.charAt(0)) ||
                !Character.isLetter(id.charAt(1)) ||
                id.charAt(2) != '-' ||
                !Character.isDigit(id.charAt(3)) ||
                !Character.isDigit(id.charAt(4)) ||
                !Character.isDigit(id.charAt(5)) ||
                !Character.isDigit(id.charAt(6)) )
        {
            buffer += "The employee ID must be in the format of AA-1234.\n";
        }
        //return the concatenated string
        return buffer;
    }
    public static String validateZipCode (String zipCode) {
        //create an empty string
        String buffer = "";
        //determine if the ZIP code is only numbers
        //determine if the ZIP code is 5 numbers long (length = 5)
        //concatenate "The zipcode must be a 5-digit number." if there was an error
        if(zipCode.length() != 5 || containsNonNumbers(zipCode))
            buffer += "The zipcode must be a 5 digit number.\n";
        //return the concatenated string
        return buffer;
    }
    public static boolean containsNonNumbers(String str) {
        //create boolean to determine if string contains non-number
        boolean nonNumber = false;
        for (int i=0; i<str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                nonNumber = true;
        }
        //return whether
        return nonNumber;
    }
}
