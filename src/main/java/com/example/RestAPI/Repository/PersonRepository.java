package com.example.RestAPI.Repository;

import com.example.RestAPI.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
