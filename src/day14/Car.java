package day14;

public abstract class Car {

    private  final String make;
    private final String model;
   private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make == null || make.isEmpty()){
            throw new RuntimeException("make can not be empty or null");
        }
        this.make = make;
        if (model == null ||model.isEmpty()){
            throw new RuntimeException("model can not be empty or null");
        }
        this.model = model;
        if (year <1886){
            throw new RuntimeException("year must not be less than 1886.");
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            throw new RuntimeException("price must not be negative.");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()){
            throw new RuntimeException("color can not be empty or null");
        }
        this.color = color;
    }
    public abstract String start();
    public abstract String drive();

    public final void stop() {
        System.out.println("Press the break to stop the car " + make + " " + model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
