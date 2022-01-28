package com.mfin.javaExercises.week1.fri.java_fundamentals;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */

        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] array = input.split(",");
//        System.out.println(Arrays.toString(array));
//        System.out.println(array[0].getClass().getSimpleName());
        for (int i=0; i<array.length; i++){
            System.out.println("We're adding the value: "+ array[i] + " To old result(" + result +")");

            result = result + Double.parseDouble(array[i]);
            System.out.println("updated result: "+ result);
        }

        System.out.println(result);
    }

}
