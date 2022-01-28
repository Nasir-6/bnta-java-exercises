package com.mfin.javaExercises.week2.day4.enums_dates_exceptions;

public class Exercise6 {

    public static void main(String[] args) {
        // try catch
        // write a program that converts program arguments to and integer
        // if value cannot be converted to int store them somewhere
        // calculate sum for numbers that can be converted to an integer
        // finally print the numbers that cannot be converted to an int
        // example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
        // output: Sum: 6 and a, b, foo are not numbers.


        //Convert 2 int arg into integer (check by summing)
        int sum = 0;
        String stringOfNonIntegers = "";

        try {
            for (String arg : args) {
                try {
                    sum = sum + Integer.parseInt(arg);
                    System.out.println(sum);
                } catch (Exception e) {

                    System.out.println("Hey \"" + arg + "\" is not an integer");
                    stringOfNonIntegers = stringOfNonIntegers + arg + ", ";
                }

            }
        //Getting rid of last space and comma due to concatenation in loop
        stringOfNonIntegers = stringOfNonIntegers.substring(0, stringOfNonIntegers.length()-2);

        System.out.println("Sum: "+ sum + " and " + stringOfNonIntegers + " are not integers");

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Please put in some arguments!!");
        }


    }

}

