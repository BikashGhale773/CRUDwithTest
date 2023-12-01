package com.example.RestAPI.Controller;

import com.example.RestAPI.Entity.Person;
import com.example.RestAPI.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }

    @GetMapping("/person/{id}")
    public Person findById(@PathVariable("id") int id){
        return personService.getById(id);
    }

    @PostMapping("/person")
    public Person saveAll(@RequestBody Person person){
        Person p = personService.savePerson(person);
        System.out.println("Person details sent from postman " + p);
        return p;
    }

    @GetMapping("/persons/{id}")
    public String deleteById(@PathVariable("id") int id){
        personService.deletePerson(id);
        return "deleted successfully";
    }

    @PostMapping("/persons/{id}")
    public Person updatePerson(@PathVariable("id") int id, @RequestBody Person person){
        //get Person from database
        Person updatePerson = personService.getById(id);
        updatePerson.setAge(id);
        updatePerson.setAge(person.getAge());
        updatePerson.setName(person.getName());
        updatePerson.setAddress(person.getAddress());
        updatePerson.setSubject(person.getSubject());
        return personService.updatePerson(updatePerson);
    }
}
