// Q: Handle division using try-catch.

import java.util.Scanner;

class ExceptionHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int a = input.nextInt();
            int b = input.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Program ended");
        }
    }
}
