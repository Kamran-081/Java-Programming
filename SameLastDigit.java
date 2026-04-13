// Q6: Write a Java program that accepts three integers and returns true
// if two or more of them have the same rightmost digit.

import java.util.Scanner;

class SameLastDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int r1 = a % 10;
        int r2 = b % 10;
        int r3 = c % 10;

        if (r1 == r2 || r2 == r3 || r1 == r3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}