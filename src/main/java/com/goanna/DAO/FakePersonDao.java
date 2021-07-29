package com.goanna.DAO;

import com.goanna.Entity.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class FakePersonDao implements PersonRepository{

    private static List<Person> DATABASE = new ArrayList<>();


    @Override
    public int insertPerson(Person person) {
        DATABASE.add(new Person(person.getId(), person.getName()));
        return 1;
    }

    @Override
    public List<Person> getAllPeople() {
        return DATABASE;
    }




    public Person selectByID(int id) {
       //return DATABASE.stream().filter(person -> person.getId().equals(id)).findFirst();
        Person found = null;
        for (Person person : DATABASE){
            if(person.getId() == id){
                found = person;
            }
        }
        return found;
    }




}
