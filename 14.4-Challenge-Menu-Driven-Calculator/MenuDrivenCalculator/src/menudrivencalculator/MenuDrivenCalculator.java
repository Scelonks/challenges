/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menudrivencalculator;

import java.util.Scanner;

/**
 *
 * @author scelo
 */
public class MenuDrivenCalculator {
    
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    
    public static int division(int num1, int num2){
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Menu Driven Calculator");
        System.out.println("====================================================");
        System.out.print("Enter the first number: ");
        String firstNumber = userInput.nextLine();
        int number1 = Integer.parseInt(firstNumber);
        System.out.println("Enter the mathematical operation you want to perform");
        System.out.println("====================================================");
        System.out.println("+ - Addition\n- - Subtraction\n* - Multiplication\n/ - Division");
        System.out.println("====================================================");
        String operator = userInput.nextLine();
        System.out.print("Enter the second number: ");
        String secondNumber = userInput.nextLine();
        int number2 = Integer.parseInt(secondNumber);
        
        switch(operator){
            case "+":
                System.out.println(number1 + " + " + number2 + " = " + addition(number1, number2));
                break;
                
            case "-":
                System.out.println(number1 + " - " + number2 + " = " + subtraction(number1, number2));
                break;
                
            case "*":
                System.out.println(number1 + " * " + number2 + " = " + multiplication(number1, number2));
                break;
                
            case "/":
                System.out.println(number1 + " / " + number2 + " = " + division(number1, number2));
                break;
                
            default: 
                System.out.println("No operator selected");
                break;
        }
    }
    
}
