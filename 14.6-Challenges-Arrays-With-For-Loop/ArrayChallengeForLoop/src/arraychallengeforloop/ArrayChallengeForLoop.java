/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraychallengeforloop;

/**
 *
 * @author commandquality
 */
public class ArrayChallengeForLoop {

    /**
     * @param args the command line arguments
     */
    public static void addOne(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            array1[i] += 1;
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    public static void evenNumbers(int array1[]) {

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0 && array1[i] % 11 == 0) {
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] myarray = {8, 41, 38, 6, 3, 58, 25, 11, 12, 78, 101, 3, 4, 9, 66,
            72, 55, 45, 78, 63, 84, 94, 100, 208, 21, 12, 14, 54, 71, 65, 99, 87, 
            33, 47, 16, 43, 20, 54, 88, 66, 22, 44, 78, 66, 33, 55, 22, 10, 15, 13};
        
        System.out.println("\nDeclared Array");

        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println();

        System.out.println("\nIncremented Array");
        addOne(myarray);

        System.out.println("\nEven Numbers");
        evenNumbers(myarray);
    }

}
