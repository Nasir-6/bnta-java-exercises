package com.mfin.javaExercises.week1.fri.java_fundamentals;

public class Exercise1 {

    public static void main(String[] args) {
        /*  Write a program that compares two numbers. i.e x > y
            Create 3 variables.
            2 to store both numbers and 1 to store the result
            Print the result
        */
        int x = 2;
        int y = 2;
        String result = compare(x,y);
        System.out.println(result);


    }

    public static String compare(int num1, int num2) {

        if(num1>num2){
            return num1 + " is larger than " + num2;
        } else if (num1 == num2 ){
            return num1 + " is equal to " + num2;
        } else {
            return num2 + " is larger than " + num1;
        }
    }



}
