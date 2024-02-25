package day14;

public final class CydeoCar extends Car implements Flyable,AutoPark,AutoPilot {
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public String start() {
        return "CydeoCar is Starting";
    }

    @Override
    public String drive() {
        return null;
    }

    @Override
    public void fly() {

    }
}
