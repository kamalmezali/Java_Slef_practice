package day08;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No Split (Yes or No)?");
        String YesorNo =  scan.next().toLowerCase();

        System.out.println("the number of people:");
        int people =  scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount= scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next().toLowerCase();

        double triprate = (quality.equals("excellent"))?0.25:(quality.equals("great"))?0.2:
                (quality.equals("good"))?0.15:(quality.equals("fair"))?0.1:0.05;

        double toutaltip = amount * triprate;

        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: " + amount);
        System.out.println("Total tip: " + toutaltip);

        if (YesorNo.equals("yes")) {
            System.out.println("Total per person: " + (amount / people));
            System.out.println("Tip per person: " + (toutaltip / people));
        }

        scan.close();

    }
}