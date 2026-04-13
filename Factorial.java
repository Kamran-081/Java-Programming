// Q8: Write a Java program to calculate factorial of a number.

import java.util.Scanner;

class Factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int fact = factorial(n);

        System.out.println("Factorial = " + fact);
    }
}