package com.mfin.javaExercises.week2.day4.enums_dates_exceptions;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise4 {

    public static void main(String[] args) {
        // 1 - Print todays Date and Time using LocalDate
        // 2 - Represent your date of birth using LocalDate
        // 3 - Add 100 days to your dob and print it

        LocalDateTime todaysLocalDateTime = LocalDateTime.now();
        System.out.println(todaysLocalDateTime);

        // IMPORTANT NOTE: Using LocalDate & NOT LocalDateTime so I get Date ONLY!!
        LocalDate myDob = LocalDate.of(1998, 12, 28);
        System.out.println(myDob);

        LocalDate myDobPlus100Days = myDob.plusDays(100);
        System.out.println(myDobPlus100Days);
    }
}
