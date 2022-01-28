package com.mfin.javaExercises.week2.day1.Arrays_conditionals_Methods;

import java.util.Arrays;

public class Exercise6 {
    /*
        Create a package called email
        Then have a method called validateEmail that return true of false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
    */
    public static void main(String[] args) {

        System.out.println(isEmailValid("hello@yahoo.com"));


    }


    public static boolean isEmailValid(String email) {

        //Locate @ symbol
        //if not located - Invalid
        //if located but index is 0 - invalid e.g-  @gmail.com
        // if located but not 0 then substring to extract and check last part of string
//        System.out.println(email.indexOf("@"));
        int atSymbolIndex = email.indexOf("@");

        if (atSymbolIndex == -1) {
            System.out.println("There is no @");
            return false;

        } else if (atSymbolIndex == 0) {
            System.out.println("it starts with @");
            return false;

        } else {

            String domainName = email.substring(atSymbolIndex);
            String[] validDomainNames = {
                    "@gmail.com",
                    "@yahoo.com",
                    "@outlook.co.uk",
                    "@hotmail.co.uk",
                    "@hotmail.com",
                    "@icloud.com"
            };


            boolean isAValidDomain = Arrays.asList(validDomainNames).contains(domainName);

            return isAValidDomain;

        }

    }
}