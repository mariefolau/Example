package com.goanna.DAO;

import com.goanna.Entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository{
    int insertPerson(Person person);
}


