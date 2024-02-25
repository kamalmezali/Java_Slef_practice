package day14;

public class CarClients {
    public static void main(String[] args) {
        Car toyota = new Toyota("Toyota Motor Corporation","Hilander", 2023, 555888, "white");
        Car tesla = new Tesla("Tesla Inc","Y", 2023, 63995.0, "black");
        Car cydeoCar = new CydeoCar("Cydeo Inc","Cydeo", 2022, 89800, "red");

        System.out.println(cydeoCar);
        System.out.println(toyota);
        System.out.println(tesla);

        System.out.println(toyota.drive());
        System.out.println(tesla.start());
        System.out.println(cydeoCar.start());






    }


}
