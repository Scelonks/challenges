/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.userdatabasewithjson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author commandquality
 */
public class CQUsers {

    static boolean validateJavaDate(String strDate) {
        if (strDate.trim().equals("")) {
            return true;
        } else {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
            sdfrmt.setLenient(false);

            try {
                Date javaDate = sdfrmt.parse(strDate);
            } catch (ParseException e) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        UsersList ul = new UsersList();
        
        List<User> c = new ArrayList<>();

        int ch;

        do {
            System.out.println("Welcome to CQ Admin Portal");
            System.out.println("==========================");
            System.out.println("Select the operation number you want to perform from the menu below or -1 to exit: ");
            System.out.println("1 - Add a user\n2 - Display all users\n3 - Search a User\n4 - Delete user\n5 - Update");
            System.out.println("==========================");
            ch = intScanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Email: ");
                    String email = userInput.nextLine();

                    System.out.println("Enter Name: ");
                    String name = userInput.nextLine();

                    System.out.println("Enter Surname: ");
                    String surname = userInput.nextLine();

                    System.out.println("Enter date of birth: ");
                    String DOB = userInput.nextLine();

                    c.add(new User(email, name, surname, DOB));
                    
                    DataManagement dm = new DataManagement();
                    
                    dm.writeAllData(ul);

                    break;
                case 2:

                    System.out.println("========================");
                    
                    DataManagement dm2 = new DataManagement();
                    
                    UsersList ul2 = new UsersList();
                    ul2 = dm2.readAllData();

                    System.out.println(ul2.getUserList().toString());
                    
                    Iterator<User> i = c.iterator();

                    while (i.hasNext()) {
                        User u = i.next();
                        System.out.println(u);
                    }
                    System.out.println("========================");

                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter email to search");
                    String searchEmail = userInput.nextLine();
                    System.out.println("=======================");
                    i = c.iterator();
                    while (i.hasNext()) {
                        User u = i.next();
                        if (u.getEmailAddress() == null ? searchEmail == null : u.getEmailAddress().equals(searchEmail)) {
                            System.out.println(u);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    }
                    System.out.println("========================");

                    break;
                case 4:
                    found = false;
                    System.out.println("Enter email to delete:");
                    searchEmail = userInput.nextLine();
                    System.out.println("=========================");
                    i = c.iterator();
                    while (i.hasNext()) {
                        User u = i.next();
                        if (u.getEmailAddress() == null ? searchEmail == null : u.getEmailAddress().equals(searchEmail)) {
                            i.remove();

                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record deleted");
                    }
                    System.out.println("============================");

                    break;

                case 5:
                    found = false;
                    System.out.println("Enter email to update:");
                    searchEmail = userInput.nextLine();
                    System.out.println("============================");
                    ListIterator<User> li = c.listIterator();
                    //i = c.iterator();
                    while (li.hasNext()) {
                        User u = li.next();
                        if (u.getEmailAddress() == null ? searchEmail == null : u.getEmailAddress().equals(searchEmail)) {

                            System.out.print("Enter Email: ");
                            email = userInput.nextLine();

                            System.out.print("Enter Name: ");
                            name = userInput.nextLine();

                            System.out.print("Enter Surname: ");
                            surname = userInput.nextLine();

                            System.out.print("Enter date of birth: ");
                            DOB = userInput.nextLine();
                            li.set(new User(email, name, surname, DOB));

                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record Updated");
                    }
                    System.out.println("======");
                    break;

            }

        } while (ch != 0);

    }

}
