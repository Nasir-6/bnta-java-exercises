package com.mfin.javaExercises.week4.dataStructuresAndAlgortihms;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Need to create instance of this Class to use methods!!
        DataStrucAndAlgo dataStrucAndAlgo = new DataStrucAndAlgo();

        // ==== Count Occurances
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8,7,8,8,8";

        // HashMap<Key, Value>
        // HashMap<KeyType, ValueType>
        HashMap<String, Integer> returnedCountMap = dataStrucAndAlgo.countOccurrences(input);


        System.out.println(returnedCountMap.keySet());


        dataStrucAndAlgo.displayHashMap(returnedCountMap);


        // Now lets find max occurance
        dataStrucAndAlgo.getMaxOccurance(returnedCountMap);




        //        //Parenthesis Checker
//        // Take input String
        String brackets = "[{{[(){}]}}[}]{}{{(())}]"; //}{
        dataStrucAndAlgo.isBalanced(brackets);




    }





}
