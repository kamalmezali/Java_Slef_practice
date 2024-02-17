package day11;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("nurset","LA Baverly Hilles RD",5);
        Server server1 = new Server("Marie Washinton",46,20.00,true);
        Server server2 = new Server("Iden Mahoms",44,19.00,false);

        Server[] servers = {server1, server2};

        Chef chef1 = new Chef("Alex Beriton", 54,60,true);
        Chef chef2 = new Chef("James Johnson",57,65,false);
        Chef [] chefs = {chef1, chef2};

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);
        System.out.println(Arrays.toString(chefs));
        System.out.println(Arrays.toString(servers));
        System.out.println(restaurant);
        server1.cleanTable();
        chef1.makeOrder();

    }
}
