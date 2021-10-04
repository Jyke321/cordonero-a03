package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution39 {
    //what I'm understanding is use a lit to store hash maps that each have all the data for a single person
    private static final String F_NAME = "fName";
    private static final String L_NAME = "lName";
    private static final String POSITION = "pos";
    private static final String SEP_DATE = "sepDate";
    public static void main(String[] args) {
        Solution39 sol = new Solution39();
        ArrayList<HashMap<String,String>> list;
        //call function to store the data in a list of hash maps
        list = (ArrayList<HashMap<String, String>>) sol.storeDataFromDataSet();
        //call a function to sort the list
        list = (ArrayList<HashMap<String, String>>) sol.sortListByLastName(list);
        //display the list of hashmaps in the fancy chart format
        sol.displayListOfHashMapsInTabularFormat(list);
    }
    public List<HashMap<String, String>> storeDataFromDataSet() {
        //make list
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        //make first hashmap of data and add it to list
        HashMap<String,String> map = new HashMap<>();
        map.put(F_NAME,"John");
        map.put(L_NAME,"Johnson");
        map.put(POSITION,"Manager");
        map.put(SEP_DATE,"2016-12-31");
        list.add(map);
        //make next hashmap for next person and so on
        map.clear();
        map.put(F_NAME,"Tou");
        map.put(L_NAME,"Xiong");
        map.put(POSITION,"Software Engineer");
        map.put(SEP_DATE,"2016-10-05");
        list.add(map);
        //next person
        map.clear();
        map.put(F_NAME,"Michaela");
        map.put(L_NAME,"Michaelson");
        map.put(POSITION,"District Manager");
        map.put(SEP_DATE,"2015-12-19");
        list.add(map);
        //next person
        map.clear();
        map.put(F_NAME,"Jake");
        map.put(L_NAME,"Jacobson");
        map.put(POSITION,"Programmer");
        map.put(SEP_DATE,"");
        list.add(map);
        //next person
        map.clear();
        map.put(F_NAME,"Jacquelyn");
        map.put(L_NAME,"Jackson");
        map.put(POSITION,"DBA");
        map.put(SEP_DATE,"");
        list.add(map);
        //next person
        map.clear();
        map.put(F_NAME,"Sally");
        map.put(L_NAME,"Webber");
        map.put(POSITION,"Web Developer");
        map.put(SEP_DATE,"2015-12-18");
        list.add(map);
        //return the list
        return list;
    }

    public List<HashMap<String, String>> sortListByLastName(List<HashMap<String, String>> list) {
        //make some sort of sorting algorithm
        //maybe make a list of just the last names and sort those
        //and then move the hash maps accordingly, not sure really
        //lets try a cs1 sorting algorithm
        int n = list.size();
        for (int i =1; i<n; i++) {
            String key = list.get(i).get(L_NAME);
            int j = i - 1;

            while (j >= 0 && (list.get(j).get(L_NAME).compareTo(key)>0)) {
                Collections.swap(list,j+1,j);
                j = j-1;
            }
        }
        //hopefully this works
        return list;
    }

    public void displayListOfHashMapsInTabularFormat(List<HashMap<String, String>> list) {
        //display top of table
        System.out.println("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------");
        //then use a loop to display rest of list
        for (HashMap<String,String> map:list) {
            System.out.println(map.get(F_NAME) + " " +
                    map.get(L_NAME) + " | " + map.get(POSITION) +
                    " | " + map.get(SEP_DATE));
        }
    }
}
