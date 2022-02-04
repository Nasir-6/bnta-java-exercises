package com.mfin.javaExercises.week2.day5.classes.calculator_static;

public class Main {

    public static void main(String[] args) {
        System.out.println("working");

        // NOT STATIC - NEEDS AN OBJECT
//        Calculator myCalculator = new Calculator();
//        System.out.println(myCalculator.add(1,2));

        //STATIC - USE CLASS TO CALL Method
        System.out.println(Calculator.add(1,2));

    }
}
