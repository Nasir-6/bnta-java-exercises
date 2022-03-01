package com.mfin.javaExercises.week4.mocking_and_interfaces;

import java.util.ArrayList;
import java.util.List;

public class PersonAccessService implements PersonDAO{
    private List<Person> people = new ArrayList<>();
    // SHOULD THE METHODS BE PUBLIC??


    @Override
    public void savePerson(Person person){
        // DONT NEED IF ALREADY CHECKED!!!!!
        if(people.contains(person)){
            throw new IllegalStateException("Person already in the list");
        }else {
            people.add(person);
        }
    }

    @Override
    public void deletePerson(int id){
        //Loop through find person with id and remove
        for (Person person : people) {
            if (person.getId() == id){
                people.remove(person);
            }
        }
    }


    @Override
    public List<Person> getPeople(){
        return people;
    }

    @Override
    public Person getPersonById(int id){

        // Loop through people array and if matche Id then return
        for (Person person : people) {
            if(person.getId() == id){
                return person;
            }
        }

        return null;
    }

}
