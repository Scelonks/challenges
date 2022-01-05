/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author commandquality
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstTerm = 0; 
        int secondTerm = 1;
        int loopTerm;
        int count = 10;

        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 2; i < count; ++i) {
            loopTerm = firstTerm + secondTerm;
            System.out.print(" " + loopTerm);
            firstTerm = secondTerm;
            secondTerm = loopTerm;
        }

    }

}
