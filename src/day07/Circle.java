package day07;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = Input.nextDouble();
        System.out.println(" The area of the Circle is: "+(3.14*radius*radius));
        System.out.println(" The perimeter of the Circle is: "+(2*3.14*radius));
    }
}
