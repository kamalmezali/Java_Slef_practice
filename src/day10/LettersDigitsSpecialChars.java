package day10;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str = "Wooden Spoon123!";
        String isletters ="";
        String isdigits = "";
        String isSpecialchars="";

        for (char each : str.toCharArray()) {

            if (Character.isLetter(each)) {
               isletters+=each;
            } else if (Character.isDigit(each)) {
                isdigits+=each;
            }else{
                isSpecialchars+=each;
            }

        }
        System.out.println("isletters = " + isletters);
        System.out.println("isdigits = " + isdigits);
        System.out.println("isSpecialchars = " + isSpecialchars);
    }
}
