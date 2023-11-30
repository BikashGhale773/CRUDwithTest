package com.example.RestAPI.Service;

import com.example.RestAPI.Entity.Person;
import com.example.RestAPI.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    @Override
    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    @Override
    public Person getById(int id){
        return personRepository.findById(id).get();
    }

    @Override
    public void  deletePerson(int id){
       personRepository.deleteById(id);
    }
}
