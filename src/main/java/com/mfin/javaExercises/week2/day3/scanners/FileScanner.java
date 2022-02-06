package com.mfin.javaExercises.week2.day3.scanners;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileScanner {

    public static void main(String[] args) {


        try{
//            src/main/java/com/mfin/javaExercises/week2/day3/scanners/input.txt
            File file = new File("src/main/java/com/mfin/javaExercises/week2/day3/scanners/input.txt");
            //            // NOTE: make sure to give path name starting from the project directory all the way to the location of the txt scanner!!!
            Scanner scanner = new Scanner(file);

//            System.out.println(scanner.nextLine());
//            System.out.println(scanner.nextLine());
//            System.out.println(scanner.nextLine());
            while(scanner.hasNext()) {
                //While it has a next line, print it out
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e){
            System.out.println("File Not Found");
        }




    }
}
