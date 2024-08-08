package test_4_august;

public class Login {
    public static void main(String[] args) {

        String username = "ADMIN";
        String password= "gold";

        if(username == "ADMIN" && password== "admin"){
            System.out.println("Logged In Successfully as ADMIN ");
        } else if (username == "USER" && password == "user") {
            System.out.println("Logged In Successfully as User");
        } else if (username == "BANKER" && password == "bank" ) {
            System.out.println("Logged In Successfully as BANKER");
        } else {
            System.out.println("Password is incorrect or User does not exists.");
        }

    }

}
