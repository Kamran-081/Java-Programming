// Write a Java program to print the area and perimeter of a circle and rectangle. 

import java.util.Scanner;

class Rectangle{
    public static void main(String[] args){
        int l, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        l = input.nextInt();
        System.out.println("Enter breadth: ");
        b = input.nextInt();

        System.out.println("Perimeter = " + (2*(l+b)));
        System.out.println("Area = " + (l*b));
    }
}
