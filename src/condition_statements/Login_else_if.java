package condition_statements;

public class Login_else_if {


    public static void main(String[] args) {


        String name = "HIMANSHU";
        String password = "axix";

        if (name == "ADMIN" && password == "admin"){
            System.out.println("Welcome to Bank.." + name);
        } else if(name=="USER" && password=="user"){
            System.out.println("welcome to bank user");

        } else if (name=="BANKER" && password=="bank"){
            System.out.println("weilcome to bank"+name);
        } else {
            System.out.println("user name and password not found in system");
        }




    }








}


