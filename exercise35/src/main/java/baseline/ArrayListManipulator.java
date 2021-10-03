package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.ArrayList;
import java.util.Random;

public class ArrayListManipulator {
    private final ArrayList<String> array = new ArrayList<>();
    private static final Random rand = new Random();

    public void addToArrayList(String item) {
        //adds the item to the array list
        //if "" don't add it
        if (!item.isEmpty())
            array.add(item);
    }
    public String pickWinnerFromArrayList() {
        //uses the rand int function to pick an index
        int index = rand.nextInt(array.size());
        //then returns the string associated with the index
        return array.get(index);
    }
}
