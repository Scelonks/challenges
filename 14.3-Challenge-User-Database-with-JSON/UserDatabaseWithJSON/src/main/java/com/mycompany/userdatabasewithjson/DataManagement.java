/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.userdatabasewithjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author commandquality
 */
public class DataManagement {
    public UsersList readAllData() throws JsonProcessingException{
        UsersList ul = new UsersList();
        
        ul = new ObjectMapper().readerFor(UsersList.class).readValue("users.json");
        
        return ul;
    }
    
    public void writeAllData(UsersList users) throws IOException{
        ObjectMapper om = new ObjectMapper();
        om.writerWithDefaultPrettyPrinter().writeValue(new File("users.json"), users);
        
    }
    
}
