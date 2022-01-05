/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingchallenge;



/**
 *
 * @author commandquality
 */
public class SortingChallenge {

    public static void displayArray(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    public static void replaceTwentiethVal(int[] array1) {
        array1[19] = 60;
        System.out.println("20th Element replaced");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    public static void replacefifthVal(int[] array1) {
        System.out.println("50th element replaced");
        array1[49] = 20;
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    public static void sortAscending(int array1[]) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                int tmp = 0;
                if (array1[i] > array1[j]) {
                    tmp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = tmp;
                }
            }
        }
    }

    public static void sortDescending(int array1[]) {

        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                int tmp = 0;
                if (array1[i] < array1[j]) {
                    tmp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myarray = {8, 41, 38, 6, 3, 58, 25, 11, 12, 78, 101, 3, 4, 9, 
            66, 72, 55, 45, 78, 63, 84, 94, 100, 208, 21, 12, 14, 54, 71, 65, 
            99, 87, 33, 47, 16, 43, 20, 54, 88, 66, 22, 44, 78, 66, 33, 55, 22, 10, 15, 13};

        System.out.println("Unsorted Array");
        displayArray(myarray);
        System.out.println();
        
        replaceTwentiethVal(myarray);
        System.out.println();
        replacefifthVal(myarray);

        System.out.println("Sorted array in ascending order");
        sortAscending(myarray);
        displayArray(myarray);
        System.out.println();

        System.out.println("Sorted array in descending order");
        sortDescending(myarray);
        displayArray(myarray);
        System.out.println();

    }

}
