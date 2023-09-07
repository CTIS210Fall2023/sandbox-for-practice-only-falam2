package edu.guilford;

// import: tells Java we're going to use the specified class
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        // A place for testing Java code
        // We want to initiate a Scanner object
        Scanner scan = new Scanner(System.in);


        // Always tell user what you want
        System.out.println("Enter the first number: ");
        // Get user input, convert to double, and store in VAR -- get Scanner to do this
        double firstNumber = scan.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = scan.nextDouble();

        double result = firstNumber * secondNumber;
        System.out.println("The result is " + result);
    }
}