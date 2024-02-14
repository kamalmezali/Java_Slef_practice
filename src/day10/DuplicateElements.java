package day10;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> duplicate = new ArrayList<>(number);
        System.out.println(number);
        for (int each : number) {
            duplicate.add(each);
        }
        System.out.println(duplicate);
    }
}
