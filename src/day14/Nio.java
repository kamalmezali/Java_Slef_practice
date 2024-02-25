package day14;

public final class Nio extends Car implements AutoPilot{
    public Nio(String make, String model, int year, double price, String color) {
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
        return null;
    }

    @Override
    public String drive() {
        return null;
    }
}
