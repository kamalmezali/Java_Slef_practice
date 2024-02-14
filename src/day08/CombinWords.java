package day08;
import java.util.Scanner;
public class CombinWords {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter your first word : ");
        String firstwored = scan.next();
        System.out.println("enter your scend word : ");
        String scendword = scan.next();

        scan.close();
        String result = "";
        if (firstwored.charAt(firstwored.length()-1) == scendword.charAt(0)) {
            result = firstwored + scendword.substring(1);
        } else {
            result = firstwored + scendword;
        }
        System.out.println(result);

    }
}
