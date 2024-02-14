package day09;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Spring Boot",
                "API", "Database", "Data Structures"};

        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);

        }
    }
}

