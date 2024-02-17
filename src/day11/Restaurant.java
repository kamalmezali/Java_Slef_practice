package day11;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    String Owner ;
    String Location ;
    int numberOfStars ;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        Owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;
    }
    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[] chefs){
    this.chefs.addAll(Arrays.asList(chefs));
    }
    public void terminateChef(int employeeID){
        chefs.remove(employeeID);
    }
    public void terminateServer(int employeeID){
        servers.remove(employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", " + servers.size() +
                ", servers=" + servers +
                ", " + chefs.size() +
                ", chefs=" + chefs +
                '}';
    }
}
