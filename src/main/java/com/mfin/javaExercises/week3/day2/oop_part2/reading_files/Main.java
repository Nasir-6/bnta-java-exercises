package com.mfin.javaExercises.week3.day2.oop_part2.reading_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    //    Create & Save File
    //    Create a Person Class
    //    Read first line
    //    Turn row 1 into a person
    //    Id, firstName, lastName, email, gender
    //    Create one person manually
    //    Now use row 1 info to make person
    //    Loop through and read multiple lines
    //    Turn each row into a person
    //    Create an array of Person[]
    //    Create and store in array

    public static void main(String[] args) {

        PersonDao personDao = new PersonDao();
        System.out.println(Arrays.toString(personDao.getPeople()));

        Person personOver99 = new Person( 10, "name", "lastName", "email", "M");
        personOver99.setId(200);
        System.out.println(personOver99);

    }



}
