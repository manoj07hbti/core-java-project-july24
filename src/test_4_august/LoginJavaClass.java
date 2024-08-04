package test_4_august;

public class LoginJavaClass {

    public static void main(String[] args) {

        //Write a code for banking software
        //case1)user is ADMIN

        String username="ADMIN";
        String password="admin";

        if(username=="ADMIN" && password=="admin") {
            System.out.println("ADMIN");
        }
            if (username == "USER" && password == "user") {
                System.out.println("USER");
            }
                if (username == "BANKER" && password == "bank") {
                    System.out.println("BANKER");
        }

        //case2)user is USER

        username="USER";
         password="user";

        if(username=="ADMIN" && password=="admin"){
            System.out.println("ADMIN");
        }
        if(username=="USER" && password=="user"){
            System.out.println("USER");
        }
        if(username=="BANKER" && password=="bank") {
            System.out.println("BANKER");
        }


        //case3)user is BANKER

         username="BANKER";
         password="bank";

        if(username=="ADMIN" && password=="admin"){
            System.out.println("ADMIN");
        }
        if(username=="USER" && password=="user"){
            System.out.println("USER");
        }
        if(username=="BANKER" && password=="bank") {
            System.out.println("BANKER");
        }
    }
}
