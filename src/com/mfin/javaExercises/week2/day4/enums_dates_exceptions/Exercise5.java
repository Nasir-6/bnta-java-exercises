package com.mfin.javaExercises.week2.day4.enums_dates_exceptions;

import java.time.LocalDate;
import java.time.Period;

public class Exercise5 {

    public static void main(String[] args) {
        // write a method that calculate age on any given date
        LocalDate dateOfBirth = LocalDate.of(1998, 12, 28);
        System.out.println(calculateAge(dateOfBirth));
    }

    private static int calculateAge(LocalDate dateOfBirth) {
        // hint: subtract todays date[year] - date[year]
        LocalDate dateToday = LocalDate.now();
//        int age = dateToday.getYear() - dateOfBirth.getYear();

        //CBA to calculate!!!
        int age = Period.between(dateOfBirth, dateToday).getYears();
        return age;
    }
}
