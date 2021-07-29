package com.goanna.DAO;

import com.goanna.Entity.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakePersonDao implements PersonRepository{

    private static List<Person> DATABASE = new ArrayList<>();


    @Override
    public int insertPerson(Person person) {
        DATABASE.add(new Person(5, "Nathan"));
        DATABASE.add(new Person(4, "Shaz"));
        DATABASE.add(new Person(3, "Jake"));
        return 1;
    }
}
