package com.heff.springbootswaggertutorial.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * Model for Test
 */
public class Person {

    @ApiModelProperty(notes = "The Id of the person")
    private int id;

    @ApiModelProperty(notes = "The First name of the person")
    private String firstName;

    @ApiModelProperty(notes = "The Last name of the person")
    private String lastName;

    @ApiModelProperty(notes = "The Age of the Person")
    private int age;



    private Person(){
    }

    private Person(int id, String firstName,String lastName,int age){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public static Person buildNewPerson(int id,String firstName,String lastName,int age){
        return new Person(id,firstName,lastName,age);
    }
    /**
     * Gets id
     *
     * @return value of id
     */
    public int getId() {
        return id;
    }

    /**
     * set id
     *
     * @Param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets firstName
     *
     * @return value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set firstName
     *
     * @Param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets lastName
     *
     * @return value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set lastName
     *
     * @Param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets age
     *
     * @return value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * set age
     *
     * @Param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
