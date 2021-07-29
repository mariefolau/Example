package com.goanna.DAO;

import com.goanna.Entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository{
    int insertPerson(Person person);

    List<Person> getAllPeople();

    Person selectByID(int id);


}


