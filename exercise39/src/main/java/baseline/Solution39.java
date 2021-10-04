package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
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
        map.clear();
        map.put("fName","Tou");
        map.put("lName","Xiong");
        map.put("position","Software Engineer");
        map.put("separationDate","2016-10-05");
        list.add(map);
        //next person
        map.clear();
        map.put("fName","Michaela");
        map.put("lName","Michaelson");
        map.put("position","District Manager");
        map.put("separationDate","2015-12-19");
        list.add(map);
        //next person
        map.clear();
        map.put("fName","Jake");
        map.put("lName","Jacobson");
        map.put("position","Programmer");
        list.add(map);
        //next person
        map.clear();
        map.put("fName","Jacquelyn");
        map.put("lName","Jackson");
        map.put("position","DBA");
        list.add(map);
        //next person
        map.clear();
        map.put("fName","Sally");
        map.put("lName","Webber");
        map.put("position","Web Developer");
        map.put("separationDate","2015-12-18");
        list.add(map);
        //return the list
        return list;
    }

    public ArrayList<HashMap> sortListByLastName(ArrayList<HashMap> list) {
        //make some sort of sorting algorithm
        //maybe make a list of just the last names and sort those
        //and then move the hash maps accordingly, not sure really
        //lets try a cs1 sorting algorithm
        int n = list.size();
        for (int i =1; i<n; i++) {
            String key = (String) list.get(i).get("lName");
            int j = i - 1;

            while (j >= 0 && (list.get(j).get("lName").toString().compareTo(key)>0)) {
                Collections.swap(list,j+1,j);
                j = j-1;
            }
        }
        //hopefully this works
        return list;
    }

    public void displayListOfHashMapsInTabularFormat(ArrayList<HashMap> list) {
        //display top of table

        //then use a loop to display rest of list

    }
}
