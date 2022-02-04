package com.mfin.javaExercises.week2.day1.Arrays_conditionals_Methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    /*
        Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
    */
    public static void main(String[] args) {


        // INitialising uInput
        String uInput;

        //loop through if yes, exit if not

        boolean goAhead = true;
        while (goAhead) {

            uInput = getUserInput();
            if (uInput.equals("yes") || uInput.equals("Yes") || uInput.equals("y")) {
                System.out.println("Here's your joke");
                displayRandomJoke();

            } else if (uInput.equals("no") || uInput.equals("No") || uInput.equals("n")) {
                //if no
                System.out.println("Alright bye bye");
                goAhead = false;
//                break;
            } else {
                //Anything else
                System.out.println("what the heck did you say! Please say yes or no!");
            }

        }

//        System.out.println("You exited becuase you said no");
        // Start displaying jokes
    }


    static String getUserInput() {
        //Read in the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to hear a joke? Yes or No");

        String input = scanner.nextLine();  // Read user input
        return input;
    }

    static void displayRandomJoke() {

        String[] randomJokesArray = new String[3];
//        System.out.println("empty array");
//        System.out.println(Arrays.toString(randomJokesArray));
        randomJokesArray[0] = "I can’t believe I got fired from the calendar factory. All I did was take a day off!";
        randomJokesArray[1] = "Money talks. Mine always says goodbye.";
        randomJokesArray[2] = "I went to see the doctor about my short-term memory problems — the first thing he did was make me pay in advance.";
//        System.out.println("filled up array");
//        System.out.println(Arrays.toString(randomJokesArray));

        //Alternative way for strings array
//        String[] randomJokesArray = {"I can’t believe I got fired from the calendar factory. All I did was take a day off!", "Money talks. Mine always says goodbye.", "j3", "j4", "j5", "j6"}; //0-5

        //random num generator
        Random randNum = new Random();
        // generator.generateRandomNumber(upperbound) => gives a number between 0 and upperbound-1
        int index = randNum.nextInt(randomJokesArray.length);
        System.out.println(randomJokesArray[index]);

    }
}

