package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution39 {
    //what I'm understanding is use a lit to store hash maps that each have all the data for a single person
    public static void main(String[] args) {
        Solution39 sol = new Solution39();
        ArrayList<HashMap> list = new ArrayList<HashMap>();
        //call function to store the data in a list of hash maps
        list = sol.storeDataFromDataSet();
        //call a function to sort the list
        list = sol.sortListByLastName(list);
        //display the list of hashmaps in the fancy chart format
        sol.displayListOfHashMapsInTabularFormat(list);
    }
    public ArrayList<HashMap> storeDataFromDataSet() {
        //make list
        ArrayList<HashMap> list = new ArrayList<>();
        //make first hashmap of data and add it to list
        HashMap<String,String> map = new HashMap();
        map.put("fName","John");
        map.put("lName","Johnson");
        map.put("position","Manager");
        map.put("separationDate","2016-12-31");
        list.add(map);
        //make next hashmap for next person and so on

        //return the list
        return list;
    }
    public ArrayList<HashMap> sortListByLastName(ArrayList<HashMap> list) {
        //make some sort of sorting algorithm
        //maybe make a list of just the last names and sort those
        //and then move the hash maps accordingly, not sure really
        return new ArrayList<HashMap>();
    }
    public void displayListOfHashMapsInTabularFormat(ArrayList<HashMap> list) {
        //display top of table

        //then use a loop to display rest of list

    }
}
