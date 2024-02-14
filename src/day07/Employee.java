package day07;

public class Employee {
    public String name;
     public int age;
     public char gender;
    public String jobTitle;
    public double salary;
    public void work(){
        System.out.println(name+" "+jobTitle+" is working.");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
