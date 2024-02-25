package day14;

public final class Tesla extends Car implements AutoPilot {
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public String start() {
        return "Tesla is starting";
    }

    @Override
    public String drive() {
        return null;
    }

    @Override
    public void selfDrive() {

    }
}
