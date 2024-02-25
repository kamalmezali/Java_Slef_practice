package day14;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

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
