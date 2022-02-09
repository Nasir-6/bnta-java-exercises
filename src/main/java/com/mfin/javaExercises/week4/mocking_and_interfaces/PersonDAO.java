package com.mfin.javaExercises.week4.mocking_and_interfaces;

import java.util.List;

public interface PersonDAO {

    // Interface contains all ABSTRACT METHODS (NO Method Body)!!
    void savePerson(Person person);

    void deletePerson(int id);

    List<Person> getPeople();

    Person getPersonById(int id);


}
