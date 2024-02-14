package day08;

public class StartWithX {
    public static void main(String[] args) {
        String str = "xcodex";

        if(str.charAt(0)=='x'){
            str=str.replaceFirst("x", "a");
        }

        System.out.println(str);

    }

}