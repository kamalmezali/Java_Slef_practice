package day09;

public class Items {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int idexGloves = 0;
        boolean hasIpad = false;
        String report = "";

        for (int i = 0; i < items.length; i++) {
           String item = items[i];
           double price = prices[i];
           int itemID = itemIDs[i];

           if (item.equals("Gloves")){
               idexGloves = i;
           }
           if (item.equals("iPad")){
               hasIpad = true;
           }
          report+=item + " - " + price + " - #" + itemID + "\n";

        }
        System.out.println("hasIpad = " + hasIpad);
        System.out.println("idexGloves = " + idexGloves);
        System.out.println(report);
    }
}
