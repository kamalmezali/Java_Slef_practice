package day12;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0 ){
            System.err.println("The radius cannot be set to a negative or zero value"+radius);
       System.exit(1);
        }
        this.radius = radius;
    }
    public double calcArea(){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    public double calcPerimeter(){
        double perimeter = 2 * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",area=" + calcArea() +
                ",perimeter=" + calcPerimeter() +
                '}';
    }
}

