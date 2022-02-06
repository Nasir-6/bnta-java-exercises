package com.mfin.javaExercises.week3.day2.oop_part2.reading_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PersonDao {

    private Person[] people;

    //Constructor for DAO!!!! NOT METHOD!!!
    public PersonDao(){

        try{
            String directoryName = "src/main/java/com/mfin/javaExercises/week3/day2/oop_part2/reading_files";
            String fileName = "PersonDB.txt";
            File personDB = new File(directoryName, fileName);

            // Function to get number of lines i.e number of people - to set Person[] size
            int numberOfPeople = getNumberOfLinesInFile(personDB);
            System.out.println("Number of People: " + numberOfPeople);

            //Creating Person array to hold all people
            Person[] personArr = new Person[numberOfPeople];




//
////            // =========== ALL OF THIS IS FOR ONE PERSON ======================
//            Scanner scanner = new Scanner(personDB);
////            //Reads first line : "id,first_name,last_name,email,gender"
//            scanner.nextLine();
////
////            // Turning one line into a Person object
//            String onePersonInfo = scanner.nextLine();
//            System.out.println(onePersonInfo);
////            // Split this string into it's id, first name, lastname email and gender
//            String[] onePersonInfoArray = onePersonInfo.split(",");
//            System.out.println(Arrays.toString(onePersonInfoArray));
//            System.out.println(onePersonInfoArray[3]);
////
//            int id = Integer.parseInt(onePersonInfoArray[0]);
//            String firstName = onePersonInfoArray[1];
//            String lastName = onePersonInfoArray[2];
//            String email = onePersonInfoArray[3];
//            String gender = onePersonInfoArray[4];
////
////            System.out.println(email);
////
//            Person person = new Person(id, firstName, lastName, email, gender);
//            System.out.println(person);
//
////            Person[] personArr = new Person[3];
//            personArr[0] = person;
////
////            // ========= CREATED SECOND PERSON TO SEE IF I CAN STORE IN PERSON ARRAY ===========
//            Person secondPerson = new Person(2, "second", "person", "email", "M");
//            personArr[1] = secondPerson;
//            System.out.println(Arrays.toString(personArr));



            // want to store in a person array
            // Issue: Person array isn't dynamic - need the number of lines in file somehow - set that to person[number of lines]







            Scanner scanner = new Scanner(personDB);
//            //Reads first line : "id,first_name,last_name,email,gender"
            scanner.nextLine();
//
//            // This will allow us to store people one by one in the people array
            int arrPosition = 0;
            while(scanner.hasNext()) {

                // Turning one line into a Person object
                String onePersonInfo = scanner.nextLine();
//                System.out.println(onePersonInfo);
                // Split this string into it's id, first name, lastname email and gender
                String[] onePersonInfoArray = onePersonInfo.split(",");
//                System.out.println(Arrays.toString(onePersonInfoArray));
//                System.out.println(onePersonInfoArray[1]);

                int id = Integer.parseInt(onePersonInfoArray[0]);
                String firstName = onePersonInfoArray[1];
                String lastName = onePersonInfoArray[2];
                String email = onePersonInfoArray[3];
                String gender = onePersonInfoArray[4];

//                System.out.println(email);
                //Creating person and storing in person Array
                Person person = new Person(id, firstName, lastName, email, gender);
//                personArr[0] = person;
                personArr[arrPosition] = person;
                arrPosition++;
            }

            people = personArr;
//            System.out.println(Arrays.toString(personArr));




        } catch (IOException e){
            System.out.println("File Not Found");
        }

    }


    public static int getNumberOfLinesInFile(File file){

        try{

            Scanner scanner = new Scanner(file);
            //Reads first line : "id,first_name,last_name,email,gender"
            // IGNORE FIRST LINE - NOT A PERSON
            scanner.nextLine();

            // Initialising count
            int numOfLines = 0;
            while(scanner.hasNext()) {
                //While it has a next line, print it out
//                System.out.println(scanner.nextLine());
//                System.out.println("--------------");
                scanner.nextLine();
                numOfLines++;
            }

            return numOfLines;

        } catch (IOException e){
            System.out.println("File Not Found");
        }


        return 0;
    }


    // HAVE Getter to access people array
    public Person[] getPeople(){
        return people;
    }

}
