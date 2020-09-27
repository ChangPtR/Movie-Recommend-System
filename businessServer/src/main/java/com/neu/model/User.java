package com.neu.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private int uid;
    private int age;
    private char gender;
    private int occupation;
    private int zipCode;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", age=" + age +
                ", gender=" + gender +
                ", occupation=" + occupation +
                ", zipCode=" + zipCode +
                '}';
    }
}
