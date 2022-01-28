package com.mfin.javaExercises.week2.day1.Arrays_conditionals_Methods;
import java.util.Scanner;


public class Exercise4 {
    /*
      Write a program that takes an input number from the console and prints if number is prime
      Create a method to check if number is prime then use against the input
    */
    public static void main(String[] args) {

        //Read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");

        int input = scanner.nextInt();  // Read user input

        //Call prime method
        isPrimeOrNot(input);

    }

    //Create prime method
    // What is a prime number?
    // Does it have a factor apart from 1 & itself?
    // Yes it is NOT a Prime
    // No it is a Prime
    static void isPrimeOrNot(int num){

//        System.out.println(num);
        // isPrime - assume it is a prime until find a factor
        boolean isPrime = true;
        // Loop through all numbers from 1-itself - check if factor (use mod i.e no remainder)
        for (int i=2; i<num; i++){
            if (num % i ==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is NOT a Prime number");
        }

    }
}

