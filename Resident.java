package com.jap.collection;

public class Resident implements  Comparable<Resident> {


    //declare the variables
    private String fullName;
    private int socialSecurityNumber;
    private char gender;


    //getter setter

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    //constructor

    public Resident(String fullName, int socialSecurityNumber, char gender) {
        this.fullName = fullName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.gender = gender;
    }


    //override toString method

    @Override
    public String toString() {
        return "Resident{" +
                "fullName='" + fullName + '\'' +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", gender=" + gender +
                '}';
    }

    public int compareTo(Resident e) {
        if (this.socialSecurityNumber == e.getSocialSecurityNumber())
            return 0;
        else if (this.socialSecurityNumber > e.getSocialSecurityNumber())
            return 1;
        else
            return -1;


    }
}
