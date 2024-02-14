package day09;

public class EvenOddNumbers {
    public static void main(String[] args) {
       int oddcount=0;
       int evencount=0;

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 1; i <array.length+1 ; i++) {
            if (i%2==0){
               evencount++;
        }else {
               oddcount++;
            }

        }

        System.out.println("The array has "+ oddcount +" odd numbers and "+ evencount +" even numbers.");
            }
        }

