package test_4_august;

public class Banking_software {

    public static void main(String[] args) {

     // Q-1 We need to make a BANKING software where we will have
        //
        //  1- login module (You can create Login Java class): Here we need to allow user name and password to check valid user
        //                    we have three user in system, system will allow only three user
        //					1. ADMIN password admin
        //					2. USER password is user
        //					3. BANKER password is bak

        String name="ADMIN";
        String password="admin";

        if(name=="ADMIN" && password=="admin"){
            System.out.println("ADMIN");
        } else{
            System.out.println("BANKER is bank");
        }

        name="USER";
        password="user";

        if(name=="USER" && password=="user"){
            System.out.println("USER");
        } else{
            System.out.println("user");
        }

       name= "BANK";
        password="bank";

        if(name=="BANK" && password=="bank"){
            System.out.println("BANK");
        } else{
            System.out.println("bank");
        }
    }








}
