package test_4_august;

public class LoginJava {

    public static void main(String[] args) {

        String name="Admin";
        String password="admin";
        if(name=="admin" && password=="admin"){
         System.out.println("admin");
    }else{
            System.out.println("PRINTING BY ADMIN");
        }


        // user by user


        name="user";
        password="user";

     if(name=="user"&& password=="user"){
         System.out.println("print user  by user");
     }else{
         System.out.println("user");
     }
     // banker password is banker

        name="banker";
        password="bank";

        if(name=="banker"&& password=="bank"){
            System.out.println("bank");
        }else{
            System.out.println("printing by banker");
        }




    }
}
