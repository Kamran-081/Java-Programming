// Q4: Write a Java program to compare two numbers.

import java.util.Scanner;

class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 > n2) {
            System.out.println("n1 is greater");
        } else if (n2 > n1) {
            System.out.println("n2 is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}