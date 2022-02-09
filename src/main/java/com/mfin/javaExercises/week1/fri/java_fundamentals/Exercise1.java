package com.mfin.javaExercises.week1.fri.java_fundamentals;

import java.io.IOException;

public class Exercise1 {

    public static void main(String[] args) {
        /*  Write a program that compares two numbers. i.e x > y
            Create 3 variables.
            2 to store both numbers and 1 to store the result
            Print the result
        */
        int x = 3;
        int y = 2;

        Exercise1 exercise1 = new Exercise1();
        String result = exercise1.compare(x,y);
        System.out.println(result);

//        try {
//            String result = compare(x,y);
//            System.out.println(result);
//
//
//        } catch(IOException e){
//            System.out.println(e);
//        }


    }

    public String compare(int num1, int num2) {

        if(num1>num2){
//            throw new IOException("hello");
            return num1 + " is larger than " + num2;
        } else if (num1 == num2 ){
            return num1 + " is equal to " + num2;
        } else {
            return num2 + " is larger than " + num1;
        }
    }



}
