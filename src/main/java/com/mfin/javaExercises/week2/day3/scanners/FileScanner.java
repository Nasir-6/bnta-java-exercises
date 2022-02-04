package com.mfin.javaExercises.week2.day3.scanners;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileScanner {

    public static void main(String[] args) throws IOException {

        File temp = new File("src/com/mfin/javaExercises/week2/day3/scanners/input.txt");
        // NOTE: make sure to give path name starting from the project directory all the way to the location of the txt file!!!
//        System.out.println(temp.getAbsolutePath());
        Scanner file = new Scanner(temp);


        while(file.hasNext()) {
            System.out.println(file.nextLine());
        }



    }
}
