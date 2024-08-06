package test_4_august;

public class LoginJavaClass {

    public static void main(String[] args) {

        //Write a code for banking software
        //case1)user is ADMIN
        //case2)user is USER
        //case3)user is BANKER

        String username="ADMIN";
        String password="admin";

        if(username=="ADMIN" && password=="admin") {
            System.out.println("ADMIN");
        }else if (username == "USER" && password == "user") {
                System.out.println("USER");
            }else if (username == "BANKER" && password == "bank") {
                    System.out.println("BANKER");
        }else{
            System.out.println("invalid password or invalid username");
        }
    }
}
