package com.mfin.javaExercises.week1.fri.java_fundamentals;

public class Exercise5 {
    /*
       Write a program that takes numbers from the program args and loops through args and print each item in args
       Compile using: javac and run using: java
       i.e. javac Exercise5.java | java Exercise5 foo bar baz
     */
    public static void main(String[] args) {
        // loop through args here
        for (int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}