package day07;

import java.util.Scanner;

public class CentsToDollar {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the cents: ");
        int cents= Input.nextInt();
        System.out.println(cents/100);
    }
}
