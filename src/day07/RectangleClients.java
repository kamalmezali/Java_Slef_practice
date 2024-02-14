package day07;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        rectangle.width=12;
        rectangle.length=24;
        System.out.println("width rectangle = " +rectangle.width );
        System.out.println("length rectangle = " + rectangle.length);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println(rectangle);
    }
}
