package com.heff.springbootswaggertutorial.services;

import com.heff.springbootswaggertutorial.model.Person;

import java.util.List;

/**
 * Person Services
 */
public interface PersonServices {


    List<Person> listAll();

    void addPerson(Person person);
}
