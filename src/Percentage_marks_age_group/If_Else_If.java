package Percentage_marks_age_group;

public class If_Else_If {

    public static void main(String[] args) {

        String userName="admin";

        String pwd="user";

        if(userName=="ADMIN" && pwd=="admin"){

            System.out.println("Welcome to Bank.."+userName);

        } else if( userName=="USER" && pwd=="user"){

            System.out.println("Welcome to Bank.."+userName);

        } else if(userName=="BANKER" && pwd=="bank"){

            System.out.println("Welcome to Bank.."+userName);

        } else {

            System.out.println("User/pwd not surch in your computer");
        }



    }
}
