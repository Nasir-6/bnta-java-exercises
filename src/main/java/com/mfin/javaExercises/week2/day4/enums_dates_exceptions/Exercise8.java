package com.mfin.javaExercises.week2.day4.enums_dates_exceptions;

public class Exercise8 {

    public static void main(String[] args) {
//        int result = 10 / 0;
        // run the above code see what error you get
        // then surround it with try catch block and catch the exception that was thrown. Inside catch the catch block print "cannot divide by 0"
            try {
                int result = 10 / 0;
            } catch(ArithmeticException e) {
                System.out.println("Cannot divide by 0!!");
            }
    }
}
