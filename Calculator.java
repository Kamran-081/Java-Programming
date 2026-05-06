// Q1. Write a Java program to create a class Calculator that accepts two numbers
// and an operator as input. Using objects, perform the required arithmetic
// operation, handle division by zero, and maintain the history of the last five calculations.

import java.util.Scanner;

class Calculator {
    double num1, num2;
    char operator;

    static String[] history = new String[5];
    static int count = 0;

    Calculator(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    void calculate() {
        double result = 0;
        boolean valid = true;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if(num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("Invalid Operator");
                valid = false;
        }

        if(valid) {
            String calc = num1 + " " + operator + " " + num2 + " = " + result;
            System.out.println("Result: " + result);

            history[count % 5] = calc;
            count++;

            System.out.println("\nLast Five Calculations:");
            int start = Math.max(0, count - 5);

            for(int i = start; i < count; i++) {
                System.out.println(history[i % 5]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        Calculator c = new Calculator(a, b, op);
        c.calculate();
    }
}
