package com.mfin.javaExercises.week2.day1.Arrays_conditionals_Methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise6Regex {

        /*
        Create a package called email
        Then have a method called validateEmail that return true of false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
    */

    public static void main(String[] args) {

        System.out.println(validate("nasir@jkhasdfh.com"));
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}(\\.[A-Z]{2,6})?$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}
