package com.mfin.javaExercises.week4.mocking_and_interfaces;

import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {


    private PersonDAO personDAO;
    private PersonService underTest;

    @BeforeEach
    void setUp() {

        // TODO: create a mock for personDAO
        personDAO = Mockito.mock(PersonDAO.class);
        // TODO: create an instance of underTest and pass personDAO into it
        underTest = new PersonService(PersonDAO);

    }

    /*
       TODO: Test all these methods.
        You might need to create additional methods. Check test coverage
    */

    //    Good luck :)

    @Test
    void itCanSavePerson() {
    }

    @Test
    void itCanDeletePerson() {
    }

    @Test
    void canGetPeopleFromDB() {
    }

    @Test
    void canGetPersonById() {

    }

}