package day14;

public class Toyota extends Car{
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public String start() {

        return "Toyota is Starting";
    }

    @Override
    public String drive() {
        return "Toyota is driving";
    }
}
