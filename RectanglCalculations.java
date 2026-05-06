// Q3. Write a Java program to create a class Rectangle with length and breadth
// as data members. Using objects, calculate area and perimeter, determine whether
// the rectangle is a square, and compare two rectangles based on area and diagonal length.

import java.util.Scanner;

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    double diagonal() {
        return Math.sqrt(length * length + breadth * breadth);
    }

    void checkSquare() {
        if(length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
    }

    void compare(Rectangle r2) {
        if(this.area() > r2.area()) {
            System.out.println("First rectangle has larger area.");
        } else if(this.area() < r2.area()) {
            System.out.println("Second rectangle has larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }

        if(this.diagonal() > r2.diagonal()) {
            System.out.println("First rectangle has larger diagonal.");
        } else if(this.diagonal() < r2.diagonal()) {
            System.out.println("Second rectangle has larger diagonal.");
        } else {
            System.out.println("Both diagonals are equal.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of first rectangle: ");
        double l1 = sc.nextDouble();
        double b1 = sc.nextDouble();

        System.out.print("Enter length and breadth of second rectangle: ");
        double l2 = sc.nextDouble();
        double b2 = sc.nextDouble();

        Rectangle r1 = new Rectangle(l1, b1);
        Rectangle r2 = new Rectangle(l2, b2);

        System.out.println("Area of first rectangle: " + r1.area());
        System.out.println("Perimeter of first rectangle: " + r1.perimeter());
        r1.checkSquare();

        System.out.println("Area of second rectangle: " + r2.area());
        System.out.println("Perimeter of second rectangle: " + r2.perimeter());
        r2.checkSquare();

        r1.compare(r2);
    }
}
