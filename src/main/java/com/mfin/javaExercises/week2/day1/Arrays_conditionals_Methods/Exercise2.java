package com.mfin.javaExercises.week2.day1.Arrays_conditionals_Methods;

import java.util.Locale;

public class Exercise2 {
    /*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
    public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";
        System.out.println(getRidOfGaps(input));
    }

    static String getRidOfGaps(String str){
        String correctedStr  = "";
        String trimmedStr = str.trim();
        System.out.println(trimmedStr);

        correctedStr  = correctedStr + trimmedStr.charAt(0);
        correctedStr = correctedStr.toUpperCase();
        System.out.println(correctedStr);

        for (int i=1; i < trimmedStr.length(); i++){

            char oneChar = trimmedStr.charAt(i);
            if(Character.isLetter(oneChar)){
                if(oneChar == 'n'){
                    correctedStr = correctedStr + " N";
                }else{
                    correctedStr = correctedStr + oneChar;
                }
            }
        }
        return correctedStr;
    }
}
