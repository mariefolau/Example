package com.goanna.Service;

import com.goanna.DAO.PersonRepository;
import com.goanna.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public int addPerson(Person person){
        return personRepository.insertPerson(person);
    }


}
