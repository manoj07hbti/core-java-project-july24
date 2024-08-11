package assignment;

public class Login {
    public static void main(String[] args) {
        String username="ADMIN";
        String password="admin";
        if(username=="ADMIN" && password=="admin"){
            System.out.println("Welcome to bank");
        }else if(username=="BANKER" && password=="banker"){
            System.out.println("welcome to bank");
        }else if(username=="USER" && password=="user"){
            System.out.println("welcome to bank");
        }else{
            System.out.println("Username/Password is invalid");
        }
    }
}
