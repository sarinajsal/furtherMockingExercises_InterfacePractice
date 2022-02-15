package com.sarina.furtherMockingSpring;

import java.util.List;
//impliments personDAO, an inference of the interface
public class PersonDataAccessLayer implements PersonDAO{

    List<Person> peopleList;


    @Override
    public void savePerson(Person person) {
        peopleList.add(person);
    }

    @Override
    public void deletePerson(int id) {
    peopleList.remove(getPersonById(id));
    }

    @Override
    public List<Person> getPeople() {
        return peopleList;
    }

    @Override
    public Person getPersonById(int id) {
        for (Person specificPerson:peopleList) {
            if(specificPerson.getId() == id);
            return specificPerson;
        }
        return null;
    }
}
