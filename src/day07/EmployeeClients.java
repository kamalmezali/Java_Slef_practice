package day07;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "alex";
        employee.age = 25;
        employee.gender = 'M';
        employee.jobTitle = "operator";
        employee.salary = 3000;
        System.out.println("name: " + employee.name);
        System.out.println("age: " + employee.age);
        System.out.println("Age: " + employee.gender);
        System.out.println("Color: " + employee.jobTitle);
        System.out.println("salary = " + employee.salary);
        employee.work();


    }
}
