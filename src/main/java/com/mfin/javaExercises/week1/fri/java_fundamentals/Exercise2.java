package com.mfin.javaExercises.week1.fri.java_fundamentals;

public class Exercise2 {

    public static void main(String[] args) {
        /*  Write a program that compares two String (STRING!!!) contents. i.e x > y
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
        */
        String x = "I am String 1";
        String y = "I am String 2";
        boolean isSameValue = compareStringvalue(x,y);
        System.out.println("Is it the same Value: " + isSameValue);


    }

    public static boolean compareStringvalue(String str1, String str2) {
        return str1==str2;
    }



}
