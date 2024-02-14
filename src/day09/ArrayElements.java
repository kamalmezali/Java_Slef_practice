package day09;

public class ArrayElements {
    public static void main(String[] args) {
        //1.1 Create an array of integers with a length of 100.
        int[] array = new int[100];

        // 1.2 Assign values from 1 to 100 to the indexes of the array.
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }


        // 1.3 Display the array elements in a single line separated by spaces.

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        // 1.4 Display the array elements in a single line in reversed order, separated by spaces.
        System.out.print("Reversed Order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
            System.out.println();


            // 1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
            System.out.print("Divisible by 5: ");
            for (int num : array) {
                if (num % 5 == 0) {
                    System.out.print(num + " ");
                }

            }
        }
    }
