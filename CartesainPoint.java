// Q9: Write a program to find whether a point lies on axis or in which quadrant.

import java.util.Scanner;

class CartesianPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("On Y-axis");
        } else if (y == 0) {
            System.out.println("On X-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("First Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Second Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Third Quadrant");
        } else {
            System.out.println("Fourth Quadrant");
        }
    }
}