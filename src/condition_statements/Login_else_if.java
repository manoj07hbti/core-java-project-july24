package condition_statements;

public class Login_else_if {


    public static void main(String[] args) {


        String name = "Himanshu";
        String password = "axis";

        if (name == "Himanshu" && password == "axis"){
            System.out.println("Welcome to Bank.." + name);

        } else if(name=="USER" && password=="user"){
            System.out.println("welcome to bank user");

        } else if (name=="HIMANSHU" && password=="axix"){
            System.out.println("welcome to bank"+name);
        } else {
            System.out.println("user name and password not found in system");
        }




    }








}


