package day14;

public abstract class BMW extends Car {
    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public String start() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }
}
