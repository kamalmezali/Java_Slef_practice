package day12;

public class Item {
    private String name;
    private Double unitPrice;
    private int quantity;
    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.trim().isBlank() ){
            System.out.println("The name cannot be empty or blank.");
        System.exit(1);
        }
        if (!name.matches("^[a-zA-Z\\\\s]+$")){
            System.err.println("Name must contain only letters and spaces.");
            System.exit(1);
        }
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        if (unitPrice<0){
            System.out.println("The unitPrice cannot be negative.");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            System.out.println("The quantity cannot be negative.");
            System.exit(1);
        }
        this.quantity = quantity;
    }
    public double calcCost() {
        return unitPrice * quantity;
    }
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost() +
                '}';
    }
}
