package day07;

import java.util.Scanner;

public class FamilyMembers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many people they live with ?");
        int people = input.nextInt();
        if (people<3){
            System.out.println("Live with less than three people.");
        } else if (people>=3 && people<=6) {
            System.out.println("Live with 3 - 6 people.");
        }else{
            System.out.println("Live with more than six people.");
        }

    }
    }

