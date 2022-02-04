package com.mfin.javaExercises.week2.day1.Arrays_conditionals_Methods;

import java.util.Arrays;

public class Exercise3 {
    /*
      Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
      You might compile and run the program via command line or by editing configuration and pass program arguments
    */
    public static void main(String[] args) {
        // args should contain numbers
//        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            oddOrEven(Integer.parseInt(args[i]));
        }
//        oddOrEven(17);

    }

    static void oddOrEven(int num){
        int remainder = num%2;
        if(remainder==0){
            System.out.println("It is Even");
        } else {
            System.out.println("It is Odd");
        }
    }
}