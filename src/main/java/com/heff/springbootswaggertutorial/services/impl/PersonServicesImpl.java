package com.heff.springbootswaggertutorial.services.impl;

import com.heff.springbootswaggertutorial.model.Person;
import com.heff.springbootswaggertutorial.services.PersonServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the Person Services
 */
@Service
public class PersonServicesImpl implements PersonServices {


    private List<Person> personList = new ArrayList<>();

    @Override
    public List<Person> listAll() {

        return personList;
    }

    @Override
    public void addPerson(Person person) {
        personList.add(person);

    }

}
