package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

import java.util.List;

public class StatisticsHandler {
    private double mean=0;

    public double average(List<Integer> array) {
        //use a for each loop to sum up values and then divide by number in list
        int sum=0;
        for (Integer item:array) {
            sum += item;
        }
        this.mean = 1.0 * sum / array.size();
        return Math.round(this.mean*100)/100.0;
    }
    public int max(List<Integer> array) {
        //use a for each loop to keep track of the largest value
        int maxVal = array.get(0);
        for (Integer item:array) {
            if (maxVal<item)
                maxVal = item;
        }
        return maxVal;
    }
    public int min(List<Integer> array) {
        //use a for each loop to keep track of the smallest value
        int minVal = array.get(0);
        for (Integer item:array) {
            if (minVal>item)
                minVal = item;
        }
        return minVal;
    }
    public double std(List<Integer> array) {
        // std = sqrt((sum_of(x_i - mean)^2)/size)
        if (this.mean == 0) {
            this.mean = this.average(array);
        }
        //sum_of(x_i - mean)
        double sumOf=0;
        for (Integer item:array) {
                sumOf += Math.pow((item - this.mean),2);
        }
        return Math.round((Math.sqrt(sumOf/array.size()))*100)/100.0;
    }
    public boolean validateInputIsNumber(String input) {
         return !input.matches(".*\\D.*");
    }
}
