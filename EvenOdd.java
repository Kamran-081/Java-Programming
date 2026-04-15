// Q5: Write a Java program to check whether a number is even or odd.
// Print 1 if even, 0 if odd.

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}