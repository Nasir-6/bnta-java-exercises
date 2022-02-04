package com.mfin.javaExercises.week2.day5.classes.string_pool;

public class Main {
    public static void main(String[] args) {

        // THey are both referring to Linda in StringPool
        String x1 = "Linda";
        String x2 = "Linda";
        // so == Should give true - Because == compares reference
        System.out.println(x1==x2);
        // .equals is true also as compares value
        System.out.println(x1.equals(x2));

        //Create a new String in the HEAP - NOT USING String pool reference
        String heapString = new String("Linda");

        // THis is false as one is in the heap, other is in the StringPool - Not the same reference
        System.out.println(x1 == heapString);

        // .equals compares values - so true
        System.out.println(x1.equals(heapString));


    }
}
