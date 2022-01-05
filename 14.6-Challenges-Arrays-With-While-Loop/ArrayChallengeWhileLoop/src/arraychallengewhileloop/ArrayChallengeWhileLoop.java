/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraychallengewhileloop;

import java.util.Random;

/**
 *
 * @author commandquality
 */
public class ArrayChallengeWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int myarray[] = new int[50];

        Random r = new Random();
        int Low = 10;
        int High = 100;

        int x = 0;
        while (x < myarray.length) {
            myarray[x] = r.nextInt(High - Low) + Low;
            x++;
        }

        System.out.println("Generated loop:");

        int k = 0;
        while (k < myarray.length) {
            System.out.print(myarray[k] + " ");
            k++;
        }
        System.out.println();

        System.out.println("add 1 to the array:");

        int j = 0;
        while (j < myarray.length) {
            System.out.print(myarray[j] + 1 + " ");
            j++;
        }
        System.out.println();

        System.out.println("\nEven numbers and numbers divisible by 11:");

        int i = 0;
        while (i < myarray.length) {
            switch (myarray[i] % 2) {
                case 0:
                    switch (myarray[i] % 11) {
                        case 0:
                            System.out.print(myarray[i] + " ");
                            break;
                    }
            }
            i++;
        }
        System.out.println();
    }
    
}
