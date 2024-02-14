package day08;

public class EmailTask2 {
    public static void main(String[] args) {

            String email = "craig_federighi@apple.com";
            
            String fistname =email.substring(0,email.indexOf("_")) ;
            String lastname= email.substring(email.indexOf("_")+1,email.indexOf("@"));
            String Domain =email.substring(email.indexOf("@")+1,email.indexOf(".")) ;

        System.out.println("First name: "+ fistname);
        System.out.println("Last name: "+ lastname);
        System.out.println("Domain: "+Domain);

    }


}

