package com.mfin.javaExercises.week2.day1.Arrays_conditionals_Methods;

public class Exercise1 {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {
        // invoke your function here
        System.out.println(reverseString("Hello"));

    }

    static String reverseString(String str){
        System.out.println(str);
        String reversedStr  = "";
        for (int i=str.length()-1; i>= 0; i--){
            char oneChar = str.charAt(i);
            reversedStr = reversedStr + oneChar;
        }
        return reversedStr;
    }
}