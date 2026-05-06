// Q2. Write a Java program to create a class Circle with radius as a data member.
// Using objects, calculate area and circumference, compare two circles based
// on area, and determine whether one circle can fit inside another.

import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void compare(Circle c2) {
        if(this.area() > c2.area()) {
            System.out.println("First circle has larger area.");
        } else if(this.area() < c2.area()) {
            System.out.println("Second circle has larger area.");
        } else {
            System.out.println("Both circles have equal area.");
        }
    }

    void fitInside(Circle c2) {
        if(this.radius < c2.radius) {
            System.out.println("First circle can fit inside second circle.");
        } else {
            System.out.println("First circle cannot fit inside second circle.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of first circle: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter radius of second circle: ");
        double r2 = sc.nextDouble();

        Circle c1 = new Circle(r1);
        Circle c2 = new Circle(r2);

        System.out.println("Area of first circle: " + c1.area());
        System.out.println("Circumference of first circle: " + c1.circumference());

        System.out.println("Area of second circle: " + c2.area());
        System.out.println("Circumference of second circle: " + c2.circumference());

        c1.compare(c2);
        c1.fitInside(c2);
    }
}
