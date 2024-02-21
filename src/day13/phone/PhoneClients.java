package day13.phone;

public class PhoneClients {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","15promax","6.7 inch",1199,"Green");
        Samsung samsung = new Samsung("Samsung","S24ultra","6.8 inch",1299,"Black");
        Nokia nokia = new Nokia("Nokia","XR20","6.6 inch",289,"white");

        System.out.println(iphone);
        iphone.call("9139152237");
        iphone.text("9139152237");
        iphone.faceTime("9139152237");

        System.out.println("_____________________");

        System.out.println(samsung);
        samsung.call("9139152237");
        samsung.text("9139152237");

        System.out.println("______________________");
        System.out.println(nokia);
        nokia.call("9139152237");
        nokia.text("9139152237");










    }
}
