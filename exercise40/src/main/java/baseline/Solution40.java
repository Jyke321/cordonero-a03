package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution40 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt user for a search string
        System.out.print("Enter a search string: ");
        String input = in.nextLine();
        //send search string to function
        EmployeeData data = new EmployeeData();
        List<HashMap<String, String>> fullList = data.createListFromDataFromDataSet();
        fullList = data.sortListByLastName(fullList);
        List<HashMap<String, String>> matchedList = data.matchedListFromSearchString(fullList,input);
        //display modified table of results
        data.displayListOfHashMapsInTabularFormat(matchedList);
    }
}
