package com.example.RestAPI.Entity;


public class Person {
    private String name;
    private int age;
    private String Address;
    private String Subject;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return Address;
    }

    public String getSubject() {
        return Subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
