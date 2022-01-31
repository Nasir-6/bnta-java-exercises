package com.mfin.javaExercises.week2.day2.writingMethods;

public class Exercise6 {
//    Write a method which takes an array of strings as an argument and returns the number of items in the array.

    public static void main(String[] args) {

        String[] myArrayOfStrings = {"This", "Is", "My", "Array"};

        numberOfItemsInArray(myArrayOfStrings);


    }


    // Write a method
    //Input - String of Arrays (String[])
    //Return - number of items in the array
    //accessParameter static DataTypeToReturn nameOFMethod(InputParameter(s)){
    //Do something here


    // Return data
    //}
    public static int numberOfItemsInArray(String[] arrayOfStrings){
        System.out.println("Method is working");
        System.out.println(arrayOfStrings[0]);
        System.out.println("Number of items:" + arrayOfStrings.length);

        return arrayOfStrings.length;
    }

}
