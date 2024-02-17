package day11;

public class ChefClients {
    public static void main(String[] args) {
        Chef chef = new Chef("Borak",1,60.05,false);
        chef.makeOrder();
        chef.washDishes();
        System.out.println(chef);
    }
}
