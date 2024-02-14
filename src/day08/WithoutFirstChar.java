package day08;
import java.util.Scanner;
public class WithoutFirstChar {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.println("enter your first word : ");
        String firstwored = scan.next();
        System.out.println("enter your scend word : ");
        String scendword = scan.next();

        scan.close();

        String result= firstwored.substring(1)+scendword.substring(1);
        System.out.println(result);
    }

    }

