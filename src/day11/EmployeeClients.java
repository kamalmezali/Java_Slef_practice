package day11;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee("James","Sdet",30,'M',100_000);
        Employee employee2 = new Employee("Alex","developer",35,'M',160_000);
        employee1.work();
        employee2.work();
        System.out.println(employee1);
        System.out.println(employee2);

    }
}
