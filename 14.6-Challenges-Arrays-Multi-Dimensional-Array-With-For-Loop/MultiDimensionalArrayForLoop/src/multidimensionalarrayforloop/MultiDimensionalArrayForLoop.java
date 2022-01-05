/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensionalarrayforloop;

import java.util.Random;

/**
 *
 * @author commandquality
 */
public class MultiDimensionalArrayForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random r = new Random();
        int Low = 0;
        int High = 100;

        System.out.println("Initial Array:");
        System.out.println("==========================");

        int myarray[][] = new int[100][30];
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                myarray[i][j] = r.nextInt(High - Low) + Low;
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("==========================");
        System.out.println("Add 1 to the array values:");
        System.out.println("==========================");

        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {

                myarray[i][j] = myarray[i][j] + 1;
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==========================");
        System.out.println("Even values and values divisible by 11:");
        System.out.println("==========================");

        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {

                if (myarray[i][j] % 2 == 0 && myarray[i][j] % 11 == 0) {
                    System.out.print(myarray[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

}
