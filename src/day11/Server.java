package day11;

public class Server {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void takeOrder(){
        System.out.println(name+" is taking an order");
    }
    public void cleanTable(){
        System.out.println(name+" is cleaning the table");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
