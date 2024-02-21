package day13.employee;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Sarah", 40, "Female", "1234", 60000, "Apple");
        Developer developer = new Developer("Alex", 45, "Male", "2456", 90000, "Google", "Python");
        Teacher teacher = new Teacher("James", 50, "Male", "2789", 120000, "Oxford");
        Driver driver = new Driver("Conor", 40, "Male", "1012", 55000, "Walmart Transportation ");

        tester.work();

        developer.work();

        teacher.work();

        driver.work();


    }
}
