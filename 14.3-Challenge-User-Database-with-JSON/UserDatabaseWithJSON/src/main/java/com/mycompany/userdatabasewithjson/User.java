/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.userdatabasewithjson;
 

/**
 *
 * @author commandquality
 */

public class User implements java.io.Serializable{
    private String emailAddress;
    private String name;
    private String surname;
    private String dob;

    public  User() {
        
    }
    
    User(String emailAddress, String name, String surname, String dob) {
        this.emailAddress = emailAddress;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }
    
    

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDob() {
        return dob;
    }

    public String toString() {
        return emailAddress + " " + name + " " + surname + " " + dob;
    }
    
}
