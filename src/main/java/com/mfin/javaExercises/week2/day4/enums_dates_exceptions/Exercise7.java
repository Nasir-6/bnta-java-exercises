package com.mfin.javaExercises.week2.day4.enums_dates_exceptions;

import java.time.LocalDate;

public class Exercise7 {
    // create a method that sums days of the month for a given array of LocalDate

    public static void main(String[] args) {
        // create a dates array
        LocalDate[] localDatesArray = {
                LocalDate.of(2000,1,1),
                LocalDate.of(2000,1,2),
                LocalDate.of(2000,1,3),
                LocalDate.of(2000,1,4),
        };


//        System.out.println(localDates[0]);
        System.out.println(sumDaysOfMonth(localDatesArray));

    }

    static int sumDaysOfMonth(LocalDate[] localDatesArray){

        //extract day of month for one element
        // System.out.println(localDatesArray[0].getDayOfMonth());

        //extract dom for all of the local
        int sumOfDaysOfMonth = 0;
        for (LocalDate localDate : localDatesArray) {
            sumOfDaysOfMonth = sumOfDaysOfMonth + localDate.getDayOfMonth();

        }
        System.out.println("sum: "+ sumOfDaysOfMonth);

        return sumOfDaysOfMonth;
    }

}

