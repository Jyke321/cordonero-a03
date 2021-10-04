package baseline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeData {
        //imported and modified from exercise 39
        private static final String F_NAME = "fName";
        private static final String L_NAME = "lName";
        private static final String POSITION = "pos";
        private static final String SEP_DATE = "sepDate";

        public List<HashMap<String, String>> createListFromDataFromDataSet() {
            //make list
            ArrayList<HashMap<String,String>> list = new ArrayList<>();
            //make first hashmap of data and add it to list
            HashMap<String,String> map1 = new HashMap<>();
            map1.put(F_NAME,"John");
            map1.put(L_NAME,"Johnson");
            map1.put(POSITION,"Manager");
            map1.put(SEP_DATE,"2016-12-31");
            list.add(map1);
            //make next hashmap for next person and so on
            HashMap<String,String> map2 = new HashMap<>();
            map2.put(F_NAME,"Tou");
            map2.put(L_NAME,"Xiong");
            map2.put(POSITION,"Software Engineer");
            map2.put(SEP_DATE,"2016-10-05");
            list.add(map2);
            //next person
            HashMap<String,String> map3 = new HashMap<>();
            map3.put(F_NAME,"Michaela");
            map3.put(L_NAME,"Michaelson");
            map3.put(POSITION,"District Manager");
            map3.put(SEP_DATE,"2015-12-19");
            list.add(map3);
            //next person
            HashMap<String,String> map4 = new HashMap<>();
            map4.put(F_NAME,"Jake");
            map4.put(L_NAME,"Jacobson");
            map4.put(POSITION,"Programmer");
            map4.put(SEP_DATE,"");
            list.add(map4);
            //next person
            HashMap<String,String> map5 = new HashMap<>();
            map5.put(F_NAME,"Jacquelyn");
            map5.put(L_NAME,"Jackson");
            map5.put(POSITION,"DBA");
            map5.put(SEP_DATE,"");
            list.add(map5);
            //next person
            HashMap<String,String> map6 = new HashMap<>();
            map6.put(F_NAME,"Sally");
            map6.put(L_NAME,"Webber");
            map6.put(POSITION,"Web Developer");
            map6.put(SEP_DATE,"2015-12-18");
            list.add(map6);
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
                String tempName = map.get(F_NAME) + " " + map.get(L_NAME);
                System.out.printf("%-19s | %-17s | %s%n",
                        tempName,map.get(POSITION),map.get(SEP_DATE));
            }
        }

        public List<HashMap<String, String>> matchedListFromSearchString(
                List<HashMap<String, String>> list, String searchKey) {
            //use a for loop to go through each it and add them to a new list
            //if a portion of their first or last name matches
            List<HashMap<String, String>> matchList =  new ArrayList<>();
            for (HashMap<String,String> map:list) {
                if (map.get(F_NAME).contains(searchKey) || map.get(L_NAME).contains(searchKey))
                    matchList.add(map);
            }
            return matchList;
        }
}
