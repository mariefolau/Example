package com.goanna.Controller;

import com.goanna.Entity.Person;
import com.goanna.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {


    @Autowired
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }


    @GetMapping
    public List returnPeople(){
        return personService.findAllPeople();
    }

    @GetMapping(path = "{id}")
    public Person getPersonBySpecificID(@PathVariable("id")int id){
        return personService.getPersonById(id);
    }

}
