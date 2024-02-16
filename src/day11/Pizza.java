package day11;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping,
            numberOfPepperoniTopping;
    public  Pizza(String size,int numberOfCheeseTopping,int numberOfPepperoniTopping){
this.size = size;
this.numberOfCheeseTopping = numberOfCheeseTopping;
this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calcCost(){
        double stratingPrice = (size.equalsIgnoreCase("small"))?10:
                (size.equalsIgnoreCase("medium"))? 12 : 14;
        double totalPrice = stratingPrice + 2 * (numberOfPepperoniTopping+numberOfCheeseTopping);
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }
}
