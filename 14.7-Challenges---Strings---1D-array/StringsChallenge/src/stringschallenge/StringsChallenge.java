/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringschallenge;

/**
 *
 * @author commandquality
 */
public class StringsChallenge {

    /**
     * @param args the command line arguments
     */
    public static void sortAscending(int array1[]) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                int tempVal = 0;
                if (array1[i] > array1[j]) {
                    tempVal = array1[i];
                    array1[i] = array1[j];
                    array1[j] = tempVal;
                }
            }
        }
    }

    public static void sortDescending(int array1[]) {

        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                int tempVal = 0;
                if (array1[i] < array1[j]) {
                    tempVal = array1[i];
                    array1[i] = array1[j];
                    array1[j] = tempVal;
                }
            }
        }
    }

    public static void main(String[] args) {

        String line = "1,4,3,2,3,7,5,6,9";

        String[] tempString = line.split(",");
        int[] numbers = new int[tempString.length];
        for (int i = 0; i < tempString.length; i++) {
            numbers[i] = Integer.parseInt(tempString[i]);
        }

        sortAscending(numbers);

        System.out.println("Sorted Array in ascending order: ");
        System.out.println("========================================");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        sortDescending(numbers);
        System.out.println("Sorted Array in descending order: ");
        System.out.println("========================================");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

}
