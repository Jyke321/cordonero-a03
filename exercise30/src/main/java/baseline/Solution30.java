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
        int[][] multiplicationTable = solution.create12by12MultiplicationTableMatrix();
        //create a function that displays the matrix with
        // the desired alignment
        solution.display12by12MultiplicationTableMatrix(multiplicationTable);
    }
    public int[][] create12by12MultiplicationTableMatrix() {
        int[][] multiplicationTable = new int[12][12];
        //uses a loop for the row
        for (int i=0; i<12; i++) {
            //uses a loop for the column
            for (int j=0; j<12; j++) {
                //sets multiplicationTable[row][column] to the product of row and column
                multiplicationTable[i][j] = (i+1)*(j+1);
                //i+1 and j+1 since they start at 0 for the index but start at 1 when multiplying
            }
        }
        return multiplicationTable;
    }
    public void display12by12MultiplicationTableMatrix(int[][] multiplicationTable) {
        //use a nested loop to get each value
        for (int i=0;i<12;i++) {
            for (int j=0; j<12;j++) {
                //print the value using indents without using the tab character
                System.out.printf("%5d", multiplicationTable[i][j]);
                //I tried the java docs but ended up using geeksforgeeks.org
                // when I realized I was looking for a format option
            }
            System.out.println();
        }
        //return nothing
    }
}
