package com.heff.springbootswaggertutorial.controllers;

import com.heff.springbootswaggertutorial.model.Person;
import com.heff.springbootswaggertutorial.services.PersonServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Person Controller
 */
@RestController
@Api(value="person Controller", description="operations to manage persons")
public class PersonController {

    @Autowired
    PersonServices personServices;

    @ApiOperation(value = "list all persons")
    @RequestMapping(value = "/list-all-persons", method = RequestMethod.GET)
    public List<Person> listAll() {
        return personServices.listAll();
    }
    @ApiOperation(value = "add new person")
    @RequestMapping(value="/add-person",method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person){
            personServices.addPerson(person);
    }
}
