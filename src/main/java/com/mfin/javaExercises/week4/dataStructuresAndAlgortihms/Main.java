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
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("a",5);
        myHashMap.put("b",2);
        System.out.println(myHashMap);
        System.out.println(myHashMap.get("a"));
        System.out.println(myHashMap.get("Two"));

        HashMap<String, Integer> mySecondHashMap = new HashMap<>();
        mySecondHashMap.put("a",5);
        mySecondHashMap.put("b",3);

        System.out.println(myHashMap.get("a").equals(mySecondHashMap.get("a")));
        System.out.println(myHashMap.get("b").equals(mySecondHashMap.get("b")));

        System.out.println(myHashMap.keySet());
        for (String key : myHashMap.keySet()) {
            System.out.println(key);
            System.out.println(myHashMap.get(key));
        }







        // HashMap<Key, Value>
        // HashMap<KeyType, ValueType>
//        HashMap<String, Integer> returnedCountMap = dataStrucAndAlgo.countOccurrences(input);


//        System.out.println(returnedCountMap.keySet());


//        dataStrucAndAlgo.displayHashMap(returnedCountMap);


        // Now lets find max occurance
//        dataStrucAndAlgo.getMaxOccurance(returnedCountMap);




        //        //Parenthesis Checker
//        // Take input String
//        String brackets = "[{{[(){}]}}[}]{}{{(())}]"; //}{
//        dataStrucAndAlgo.isBalanced(brackets);




    }





}
