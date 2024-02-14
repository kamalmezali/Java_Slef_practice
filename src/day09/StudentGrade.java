package day09;

public class StudentGrade {
    public static void main(String[] args) {
        String[]studentNames = {"Anna","Nancy","Sarah"};
        int[] scores={90,75,80};
        char[] grade = new char[studentNames.length];

        for (int i = 0; i < grade.length; i++) {
        int score = scores[i];
         if(score>=90){
             grade[i]='A';
        } else if (score>=80) {
             grade[i]='B';
         } else if (score>=70) {
             grade[i]='C';
         } else if (score>=60) {
             grade[i]='D';

         }else {
             grade[i]='F';
         }
            System.out.println(studentNames[i]+"'s score is "+scores[i]+", and grade is "+grade[i]);
        }

    }
    }

