package day09;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        //  2.1 Create an array of strings named classmates.

        String[] classmates ={"Yusef kbir","Hamza Maroci","Samir DJ","Nasim Bititi","Adel Gaceb","Abdelatif Baghliya",
        "Karim Banana","hicham Alouach","Yacin L3abri","Houssam Anabi"};

        //2.2 Store full names of 10 classmates.

        String[] initials = new String[classmates.length];
        for (int i = 0; i < classmates.length ; i++) {
            initials[i]=classmates[i].charAt(0)+""+classmates[i].charAt(classmates[i].indexOf(" ")+1);

        }
        //2.3 Print the initials of each student's name in separate lines.
        System.out.print(Arrays.toString(initials));
    }
}
