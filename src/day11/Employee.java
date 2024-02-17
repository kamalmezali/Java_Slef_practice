package day11;

public class Employee {
    public String name,jobTitle;
    public int age;
    public char gender;
    public double salary;

    public Employee(String name, String jobTitle, int age, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
    public void work(){
        System.out.println(jobTitle+" "+ name +" is working.");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +

                '}';
    }
}
