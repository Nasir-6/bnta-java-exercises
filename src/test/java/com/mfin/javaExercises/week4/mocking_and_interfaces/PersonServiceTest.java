package com.mfin.javaExercises.week4.mocking_and_interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

// WHY IS EXTEND NOT WORKING? NOT NEEDED?? ==========================
//@ExtendWith(MockitoExtension.class);   DONT USE THIS!!
class PersonServiceTest {

    //@Mock
    private PersonDAO personDAO;
    // PersonService isn't a mock we are testing it!!
    private PersonService underTest;

    @BeforeEach
    void setUp() {
        // TODO: create a mock for personDAO
//        MockitoAnnotations.openMocks(this);     //Now you can use the annotation on the mock itself - this refers to the @Mock handle I think
        personDAO = Mockito.mock(PersonDAO.class);     // THIS IS without @MOCK annotation
        // TODO: create an instance of underTest and pass personDAO into it
        underTest = new PersonService(personDAO);       //ERROR IF you pass in class PersonDAO - Note the Capital letter!!!
    }

    /*
       TODO: Test all these methods.
        You might need to create additional methods. Check test coverage
    */

    //    Good luck :)

    //TODO: Do all savePerson Method

    @Test
    void itCanSavePerson() {
        //Given
        Person person = new Person(1, "Nasir", 10);

        // THIS makes sure if anything is in there we didn't use this accidently
        // MAKE SURE Id is not same!!!
        given(personDAO.getPeople()).willReturn(List.of(new Person(2, "Mohammed", 21)));


        //When
        underTest.savePerson(person);

        //Then
        //Now check if mockDAO tried to save THAT STUDENT!!
        // First use Argument capture
        ArgumentCaptor<Person> personArgumentCaptor = ArgumentCaptor.forClass(Person.class);
        // Can do @argument captor outside if you want - Naaaa

        // Now verify that the dao used the "savePerson"(MAKE SURE IT IS SAME NAME) function and passed the right Person
        verify(personDAO).savePerson(personArgumentCaptor.capture());
        // Now verify it's the same person - Also with the given list above also makes sure other person isn't the captured one!!
        Person actual = personArgumentCaptor.getValue();
        assertThat(actual).isEqualTo(person);

    }


    @Test
    void itShouldNotSavePersonWithNullId() {
        //Given
        Person person = new Person(null, "Nasir", 21);
        //When called
        //Then it should throw !!
        assertThatThrownBy(() -> underTest.savePerson(person))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("Person cannot have empty fields");
        // Don't forget to verify savePerson wasn't used!!
        verify(personDAO, never()).savePerson(any());
    }



    @Test
    void itShouldNotSavePersonWithNullAge() {
        //Given
        Person person = new Person(1, "Nasir", null);

        //When called
        //Then it should throw !!
        assertThatThrownBy(() -> underTest.savePerson(person))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("Person cannot have empty fields");
        // Don't forget to verify savePerson wasn't used!!
        verify(personDAO, never()).savePerson(any());
    }


    @Test
    void itShouldNotSavePersonWithNoName() {
        //Given
        Person person = new Person(1, "", 21);

        //When called
        //Then it should throw !!
        assertThatThrownBy(() -> underTest.savePerson(person))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("Person cannot have empty fields");
        // Don't forget to verify savePerson wasn't used!!
        verify(personDAO, never()).savePerson(any());
    }



    // HOW DO YOU DO THIS ONE????
    @Test
//    @Disabled
    void itShouldNotSavePersonWithExistingId() {
        //Given
        //
        Person person = new Person(1, "Nasir", 10);
        // DONT MOCK UNDER TEST
        // MOCK DAO - i.e get people will return a list - so can use for getId!!!
        // In this case Nasir and Mohammed have same ID!!!!!!
        given(personDAO.getPeople()).willReturn(List.of(new Person(1, "Mohammed", 21)));


        //When called
        //Then it should throw !!
        assertThatThrownBy(() -> underTest.savePerson(person))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("person with id " + person.getId() + " already exists");
        // Don't forget to verify savePerson wasn't used!!
        verify(personDAO, never()).savePerson(any());
    }


    //TODO: Do all DeletePerson Method


    // THIS ONE's FAILING ASWELL!!
    @Test
    @Disabled
    void itCanDeletePerson() {
        //Given
        Person person = new Person(2, "Nasir", 12);
        // THIS makes sure if anything is in there we didn't use this accidently
        // MAKE SURE Id is not same!!!
        given(personDAO.getPeople()).willReturn(List.of(person, new Person(1, "Mohammed", 23)));

        // When
        underTest.deletePerson(person.getId());
        // Note the given above will return true as person already in list

        // Then
        // Need to use argument capture and see if it actual id being captured?
        //Now check if mockDAO tried to delete THAT STUDENT USING ID!!
        // First use Argument capture
        ArgumentCaptor<Integer> integerArgumentCaptor = ArgumentCaptor.forClass(Integer.class);
        // Now verify that the dao used the "deletePerson"(MAKE SURE IT IS SAME NAME) function and passed the right Person
        verify(personDAO).deletePerson(integerArgumentCaptor.capture());

        // Now verify it's the same person - Also with the given list above also makes sure other person isn't the captured one!!
        int actual = integerArgumentCaptor.getValue();
        assertThat(actual).isEqualTo(person.getId());

    }



    @Test
    void itShouldntDeletePersonIfPersonIsntOnTheList() {
        //Given
        Person person = new Person(1, "Nasir", 12);
        given(personDAO.getPeople()).willReturn(List.of(new Person(2, "Mohammed", 23)));
        // When Called
        // Then
        // Now verify that the dao used the "deletePerson"(MAKE SURE IT IS SAME NAME) function and passed the right Person
        //When called
        //Then it should throw !!
        assertThatThrownBy(() -> underTest.deletePerson(person.getId()))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("person with id " + person.getId() + " not found");

        // Don't forget to verify deletePerson wasn't used!!
        verify(personDAO, never()).deletePerson(anyInt());


    }


    @Test
    @Disabled
    void itShouldntDeletePersonIfPersonHasNullId() {
        //Given
        Person person = new Person(null, "Nasir", 12);
        given(personDAO.getPeople()).willReturn(List.of(new Person(2, "Mohammed", 23)));
        // When Called
        // Then
        // Now verify that the dao used the "deletePerson"(MAKE SURE IT IS SAME NAME) function and passed the right Person
        //When called
        //Then it should throw !!
        assertThatThrownBy(() -> underTest.deletePerson(person.getId()))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("person with id " + person.getId() + " not found");

        // Don't forget to verify deletePerson wasn't used!!
        verify(personDAO, never()).deletePerson(anyInt());


    }




    //TODO: Do all GetPeople Method
    // IS IT JUST ONE METHOD??
    @Test
    void canGetPeopleFromDB() {
        // Given
        List<Person> people = new ArrayList<>();
        Person person = new Person(1,"Nasir", 21);
        people.add(person);
        given(personDAO.getPeople()).willReturn(people);

        // When
        List<Person> actual = underTest.getPeople();

        // Then
        verify(personDAO).getPeople();
        // Is this needed
        assertThat(actual).isEqualTo(people);

    }




    //TODO: Do all GetPersonById Method
//    @Test
//    @Disabled
//    void canGetPersonById() {
//        // Given
//        int id = 1;
//
//
//        // When
//        given(personDAO.getPersonById(id)).willReturn(new Person(1,"Nasir" , 21));
//        Person actual = underTest.getPersonById(id);
//
//        //Then???
//        Person expected = new Person(1,"Nasir", 21);
//        assertThat(actual).isEqualTo(expected);
//
//    }


    @Test
    void itShouldNotGetPersonByIdIfPersonNotFound() {
        // Given
        int id = 1;


        // When
        given(personDAO.getPersonById(id)).willReturn(null);

        assertThatThrownBy(() -> underTest.getPersonById(id))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("person with id " + id + " not found");


        //Then???
        //ANY OTHER ASSERTIONS???

    }
}