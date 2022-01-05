/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensionalarraywhileloop;

import java.util.Random;

/**
 *
 * @author commandquality
 */
public class MultiDimensionalArrayWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r = new Random();
        int Low = 0;
        int High = 100;

        int myarray[][] = new int[100][30];
        int i = 0;
        int j = 0;
        System.out.println("Initial Array:");
        System.out.println("==========================");
        while (i < myarray.length) {
            while (j < myarray[i].length) {
                myarray[i][j] = r.nextInt(High - Low) + Low;
                System.out.print(myarray[i][j] + " ");
                i++;
            }
            i++;
            System.out.println();
        }

        System.out.println();
        System.out.println("==========================");
        System.out.println("Add 1 to the array values:");
        System.out.println("==========================");

        while (i < myarray.length) {
            while (j < myarray[i].length) {
                myarray[i][j] = r.nextInt(High - Low) + Low;
                System.out.print(myarray[i][j] + 1 + " ");
                i++;
            }
            i++;
            System.out.println();
        }

        System.out.println("==========================");
        System.out.println("Even values and values divisible by 11:");
        System.out.println("==========================");

        

        while (i < myarray.length) {
            while (j < myarray[i].length) {

                switch (myarray[i][j] % 2) {
                    case 0:
                        switch (myarray[i][j] % 11) {
                            case 0:
                                System.out.print(myarray[i] + " ");
                                break;
                        }
                }
                i++;
            }
            i++;
            System.out.println();
        }
    }
    
}
