package com.example.RestAPI.Service;

import com.example.RestAPI.Entity.Person;

import java.util.List;

public interface PersonService {
    public List<Person> getAllPerson();

    public Person savePerson(Person person);

    public Person getById(int id);
    public void deletePerson(int id);

    public Person updatePerson(Person person);

}
