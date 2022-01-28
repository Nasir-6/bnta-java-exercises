package com.mfin.javaExercises.week2.day4.enums_dates_exceptions;


import java.util.Arrays;

public class Exercise3 {

    public static void main(String[] args) {
        // invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
        // hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase

        TShirtSize[] TShirtSizes = TShirtSize.values();
        System.out.println(Arrays.toString(TShirtSizes));

        for (TShirtSize tShirtSize : TShirtSizes) {
            // Use.name rather than .toString() as can overwrite toString with new method but .name() is FINAL!!
            System.out.println(tShirtSize.name().toLowerCase());
        }
    }
}
