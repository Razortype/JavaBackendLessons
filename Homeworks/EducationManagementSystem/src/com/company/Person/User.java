package com.company.Person;

public class User {

    private int userID;
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public User(int userID, String name, String surname, int age, boolean gender) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }
}
