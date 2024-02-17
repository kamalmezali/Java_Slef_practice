package day11;

public class CydeoStudentClients {
    public static void main(String[] args) {
        CydeoStudent.schoolName ="Cydeo School";
        CydeoStudent.programmingLanguage = "java";
        CydeoStudent cydeoStudent1 = new CydeoStudent("James",25,1023,'A',33,10);
        CydeoStudent cydeoStudent2 = new CydeoStudent("Sarah",30,1023,'B',30,11);
        cydeoStudent1.study();
        cydeoStudent1.attendClass();
        cydeoStudent2.study();
        cydeoStudent2.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();
        System.out.println(cydeoStudent1);
        System.out.println(cydeoStudent2);
    }
}
