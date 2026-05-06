// Q4. Write a Java program to create a class Triangle with three sides as data members.
// Using objects, validate whether the sides form a triangle, identify its type
// (equilateral, isosceles, or scalene), and calculate its area using Heron's Formula.

import java.util.Scanner;

class Triangle {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    void type() {
        if(a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if(a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }

    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of triangle: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        Triangle t = new Triangle(x, y, z);

        if(t.isValid()) {
            System.out.println("Valid Triangle");
            t.type();
            System.out.println("Area: " + t.area());
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
