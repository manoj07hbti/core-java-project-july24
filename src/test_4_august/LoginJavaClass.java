package test_4_august;

public class LoginJavaClass {

    public static void main(String[] args) {

        // BANKING SOFTWARE

        String name= "ADMIN";
        String Password= "admin";

        if(name=="ADMIN" && Password=="admin"){
            System.out.println("ADMIN");
        } else{
            System.out.println("BANKER is bank");
            System.out.println("USer is user");
        }

        // user is user

        name="USER";
        Password="user";

        if(name=="USER" && Password=="user"){
            System.out.println("USER");

        } else{
            System.out.println("ADMIN IS admin");
        }

        // banker is bank

        name="BANKER";
        Password="bank";

        if(name=="BANKER" && Password=="bank"){
            System.out.println("BANKER");
        } else{
            System.out.println("USER IS user");
        }



    }






}
