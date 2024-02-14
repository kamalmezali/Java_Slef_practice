package day07;

public class Address {
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
     public int zipCode;

    /*Example:
    buildingNumber = 7925;
    street = "Jones Branch Dr";
    city = "McLean";
    state = "VA";
    zipCode = 22012;

    Output:
            7925 Jones Branch Dr
    McLean Va, 22012*/

    @Override
    public String toString() {
        return "Address :" +
                 buildingNumber +
                " " + street + " " +
                 city +" " +state +", " +
               zipCode ;
    }
}
