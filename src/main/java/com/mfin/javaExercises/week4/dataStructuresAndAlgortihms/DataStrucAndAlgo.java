package com.mfin.javaExercises.week4.dataStructuresAndAlgortihms;

import java.util.Arrays;
import java.util.HashMap;

public class DataStrucAndAlgo {

    public void displayHashMap(HashMap<String, Integer> returnedCountMap) {
        System.out.println("========= Displaying HashMap Key & Values ========");
        for (String key: returnedCountMap.keySet()){
//            System.out.println("Current Key is: " + key);
//            System.out.println("Current Value is: " + returnedCountMap.get(key));
            // THis just displays Each Key with its Value nicely
            // Key = Value
            System.out.println(key+ " = " + returnedCountMap.get(key));
        }
    }


    public void getMaxOccurance(HashMap<String, Integer> returnedCountMap) {
        //Setting first value as max (Initialise storage variables)
        String maxKey = null;
        int maxValue = 0; //= returnedCountMap.get("1");
        for (String key: returnedCountMap.keySet()){
//            System.out.println(key+ " = " + countMap.get(key));
            // Loop through all keys
            if(maxKey == null){
                //If maxKey is null i.e First Key found - then set the values
                maxKey = key;
                maxValue = returnedCountMap.get(key);
            } else if (returnedCountMap.get(key) > maxValue){
                // if the value for the key is larger than maxValue
                // Store both the key and the maxvalue
                maxKey = key;
                maxValue = returnedCountMap.get(key);
            } else if (returnedCountMap.get(key) == maxValue){
                // e.g 1 And 7 occur 4 times
                maxKey = maxKey + " And " + key;
            }
            // get the value

        }
        //Concat

        System.out.println(maxKey + " occurs the most number of times (" + maxValue + " times)" );
    }

    public HashMap<String,Integer> countOccurrences(String input) {
        //Split the input
        String[] strArr = input.split(",");
        System.out.println(Arrays.toString(strArr));

        //Initialise HashMap to store count Key = NumberSting
        HashMap<String, Integer> countMap = new HashMap<>();
        System.out.println(countMap);
        // Loop through the splitArray
        for (String element : strArr) {

            if (!countMap.containsKey(element)) {
                // If key doesn't exist
                // Set to one
                countMap.put(element,1);
                System.out.println("Creating a new key for: " +element);
                System.out.println(countMap);
            } else {
                //Else If key Exists
                // Increment The Value by One
                int updatedValue = countMap.get(element) + 1;
                countMap.put(element, updatedValue);
                System.out.println("Key already exists Updating value for: " +element);
                System.out.println(countMap);
            }
        }

        System.out.println(countMap);

        //Return the hashmap
        return countMap;
    }






    public void isBalanced(String brackets) {
        //Initialise Hashmaps
        // This HashMap COntains all complementary brackets as Key Value Pairs
        HashMap<Character, Character> complementMap = new HashMap<>();
        complementMap.put('{','}');
        complementMap.put('[',']');
        complementMap.put('(',')');
//        System.out.println(complementMap.get('('));


        //Setup Hashmap to store count of each bracket!!
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();


        //Split it up - NO NEED Just loop through length
//        System.out.println(brackets.charAt(2));
        int newValue;
        for (int i = 0; i < brackets.length(); i++){
            // Loop through to count all occurances (Like Other Exercise)
//            System.out.println(brackets.charAt(i));
            char key = brackets.charAt(i);
            if (!countMap.containsKey(key)){
                // if countMap doesn't contain key set it to 1
                countMap.put(key, 1);
            }else{
                //Key already has value - Increment the current value
                newValue = countMap.get(key) + 1;
                countMap.put(key, newValue);
            }

        }

        System.out.println(countMap);
//        System.out.println(Arrays.toString(countMap.entrySet().toArray()));
        for (Character key: countMap.keySet()){
            System.out.println(key+ " = " + countMap.get(key));
        }
        // Create hashmap as Complementary finder

        //Loop through and count each one using Another HashMap
        boolean allMatched = true;
        for (Character key : complementMap.keySet()) {
            // Get key and complementaryKey ( key = '(', ComplementaryKey = ')' )
            Character complementaryKey = complementMap.get(key);

            //Now check if their respective countMap values don't match
            if(countMap.get(key) != countMap.get(complementaryKey)){
                allMatched = false;
            }

        }

        if (allMatched){
            System.out.println("All brackets are matched");
        } else {
            System.out.println("There is an unmatched bracket");
        }

        //Then use complementary Finder along with other HashMap to find
        // if complementary count is NOT Equal - set to false
        //Esle assume True!!
    }



}
