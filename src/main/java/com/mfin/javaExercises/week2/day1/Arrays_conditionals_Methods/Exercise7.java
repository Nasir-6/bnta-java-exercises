package com.mfin.javaExercises.week2.day1.Arrays_conditionals_Methods;

public class Exercise7 {
    /*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */
    public static void main(String[] args) {

        //First loop through array

        // Find lenght of each string
        // Compare it - if longer store
        String[] stringArray = {"hello", "ola", "bye", "ciao", "bingo", "okays", "bingo"};
        System.out.println(findLongestString(stringArray));

    }

    static String findLongestString(String[] strArray){

        String longestStr = strArray[0];
        int longestStrLength = strArray[0].length();

        for (int i = 1; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
            if (longestStrLength<strArray[i].length()){
                longestStr = strArray[i];
                longestStrLength = strArray[i].length();

            } else if (longestStrLength == strArray[i].length()){
                if(!longestStr.contains(strArray[i])) {
                    //if doesn't contain str then concatenate
                    longestStr = longestStr + ", " + strArray[i];
                }
            }

        }

        return longestStr;
    }
}
