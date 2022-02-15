package com.sarina.furtherMockingSpring;

import java.util.List;

public interface PersonDAO {

        void savePerson(Person person);
        void deletePerson(int id);
        List<Person> getPeople();
        Person getPersonById(int id);

}
