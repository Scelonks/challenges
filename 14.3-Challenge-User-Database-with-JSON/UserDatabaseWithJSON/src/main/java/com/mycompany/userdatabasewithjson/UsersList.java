/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.userdatabasewithjson;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author commandquality
 */
public class UsersList {
    private List<User> userList = new ArrayList<User>();
    
     public UsersList() {
        this.userList = new ArrayList<User>();
    }
    
//    public UsersList() {
//        super();
//        this.userList = userList;
//    }
    
    

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    
}
