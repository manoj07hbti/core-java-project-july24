package conditional_statements;

public class Login {

    public static void main(String[] args) {

        String userName="BANKER";
        String pwd="ssaad";


        if(userName=="ADMIN" && pwd=="admin"){
            System.out.println("Welcome to Bank.."+userName);
        } else if( userName=="USER" && pwd=="user"){
            System.out.println("Welcome to Bank.."+userName);
        } else if(userName=="BANKER" && pwd=="bank"){

            System.out.println("Welcome to Bank.."+userName);
        } else {
            System.out.println("User/pwd not found in system");
        }



    }
}
