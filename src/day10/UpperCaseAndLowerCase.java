package day10;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java";

        int countUpperCase = 0,
                countLowerCase = 0;


        for (char each : str.toCharArray()) {
            if(Character.isLetter(each)){
                if(Character.isUpperCase(each)){
                    countUpperCase++;
                }else{
                    countLowerCase++;
                }
            }
        }

        System.out.println(countLowerCase == countUpperCase);

    }

}
