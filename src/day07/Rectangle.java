package day07;

public class Rectangle {
    public double width;
    public double length;

   public void calculateArea(){
       System.out.println("the area of the rectangle: "+(length * width));
   }
    public void calculatePerimeter(){
        System.out.println("the perimeter of the rectangle: "+(length+width)*2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
