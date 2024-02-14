package day04;

public class MedianNumber {
    public static void main(String[] args) {
       int a = 20,
        b = 15,
        c = 10;
       if ((a<b && a>c) ||(a>b && a<c)){
           System.out.println(a+" is median number");
       } else if ((b<a && b>c) || (b>a && b<c)) {
           System.out.println(b +" is median number");

       } else if ((c<b && c>a) || (c>b && c<a)) {

           System.out.println(c+" is median number");
       }

    }
}
/*
2. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */
