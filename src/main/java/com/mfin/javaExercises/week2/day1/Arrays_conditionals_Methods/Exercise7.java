package com.mfin.javaExercises.week2.day1.Arrays_conditionals_Methods;

import java.util.ArrayList;
import java.util.Arrays;

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
        String[] stringArray = {"hello", "ola", "bye", "ciao", "bingo", "okays", "bingo", "Hellooos"};

//        String[] stringArray = {"hello", "hello", "ola", "bye", "ciao", "bingo"};
        System.out.println(findLongestString(stringArray));

    }


//    // Input - string array
//    // Output - Longest string from the array
//    static String findLongestString(String[] strArray){
//        System.out.println(Arrays.toString(strArray));
//        //Loop through StrArray
//        int maxLength = 0;  //Placeholder to keep track of longest
//        String longestString = "";
//
//        for (String str : strArray) {
//            //Check each element - Take out element and count string lenght
////            System.out.println(str);
////            System.out.println(str.length());
//            //If it is the longest
//            if(str.length() > maxLength) {
//                // Store it
//                maxLength = str.length();
//                longestString = str;
//            } else if (str.length() == maxLength){
//                // If you find same lenght string store it - via concatenation
//                // If you find the same string ignore it - Str.Contains
//                if(!longestString.contains(str)){
//                    // Else concatenatae
//                    longestString = longestString + ", " + str;
//                }
//            }
//        }
//        //Return the longest string
//        return longestString;
//
//    }





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
