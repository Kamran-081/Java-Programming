// Q3: Write a Java program to swap two variables with or without third variable.

import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // With third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : a = " + a + ", b = " + b);

        // Without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping : a = " + a + ", b = " + b);
    }
}