/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cquserportal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author scelo
 */
public class CqUserPortal {

    /**
     * @param args the command line arguments
     */
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

    public static void serialiseToFile(Object object, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream("userListData");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(object);

            oos.close();

            fos.close();

            System.out.println("Serialization Successful");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

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
                    System.out.print("Enter Email: ");
                    String email = userInput.nextLine();

                    System.out.print("Enter Name: ");
                    String name = userInput.nextLine();

                    System.out.print("Enter Surname: ");
                    String surname = userInput.nextLine();

                    System.out.print("Enter date of birth: ");
                    String DOB = userInput.nextLine();

                    c.add(new User(email, name, surname, DOB));

                    serialiseToFile(c, "userListData");
                    
                    break;
                case 2:

                    System.out.println("========================");

                    try {
                        FileInputStream fis = new FileInputStream("userListData");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        c = (List) ois.readObject();

                        ois.close();
                        fis.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                        return;
                    } catch (ClassNotFoundException e) {
                        System.out.println("Class not found");
                        e.printStackTrace();
                        return;
                    }

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
                            serialiseToFile(c, "userListData");
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

                            serialiseToFile(c, "userListData");

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
