package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jacob Cordonero
 */

public class Solution30 {

    public static void main(String[] args) {
        Solution30 solution = new Solution30();
        //generate a multiplication table
        //because table is in the format
        /* 1 2 3 ... 12
           2 4 6 ... 24
           .  .
           .     .
           .        .
           12    ... 144
         */
        //in other words we are creating a 12x12 matrix
        //this can be represented with the variables nxm
        //where n represents rows and m represents columns
        //so the 6 above is in row 2 and column 3
        //or in other words, the number displayed in each matrix location
        //is equal to the product of the given row times the given column.

        //create function that makes  a 2 dimensional array
        // with row and column length and width of 12 each.

        //create a function that displays the matrix with
        // the desired alignment

    }
    public int[][] create12by12MultiplicationTableMatrix() {
        int[][] multiplicationTable = new int[12][12];
        //uses a loop for the row

            //uses a loop for the column

                //sets multiplicationTable[row][column] to the product of row and column

        return multiplicationTable;
    }
    public void display12by12MultiplicationTableMatrix() {
        //use a nested loop to get each value
            //print the value using indents without using the tab character
            //(I have no clue how to do that, but I know c had formatting stuff, so maybe I should look at documentation here)
            //nah, stack overflow sounds easier
        //return nothing
    }
}
