package day07;

import java.util.Scanner;

public class GradReport {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println(" Enter your score: ");
        int score= Input.nextInt();
        if (score<0 || score>100) {
            System.err.println("invalid score");
        } else if (score<=50) {
            System.out.println("Your grade is D");
        } else if (score>50 && score<=70) {
            System.out.println("Your grade is C");
        } else if (score>70 && score<=85) {
            System.out.println("Your grade is B");
        }else if (score>85){
            System.out.println("Your grade is A");
        }
    }
}
