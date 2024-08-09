package condition_statements;

public class Login_else_if {


    public static void main(String[] args) {
        //  String userName="BANKER";
        //        String pwd="ssaad";
        //
        //
        //        if(userName=="ADMIN" && pwd=="admin"){
        //            System.out.println("Welcome to Bank.."+userName);
        //        } else if( userName=="USER" && pwd=="user"){
        //            System.out.println("Welcome to Bank.."+userName);
        //        } else if(userName=="BANKER" && pwd=="bank"){
        //
        //            System.out.println("Welcome to Bank.."+userName);
        //        } else {
        //            System.out.println("User/pwd not found in system");
        //        }

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


