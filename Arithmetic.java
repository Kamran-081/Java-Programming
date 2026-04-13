// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of 
// two numbers.

import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println("sum of  " + n1 + " and " + n2 + " : " + (n1 + n2));
        System.out.println("Difference of  " + n1 + " and " + n2 + " : " + (n1 - n2));
        System.out.println("product of  " + n1 + " and " + n2 + " : " + (n1*n2));
        System.out.println("Division: " + (n1 / (float)n2));
        System.out.println("rem of  " + n1 + " and " + n2 + " : " + (n1%n2));
    }
}