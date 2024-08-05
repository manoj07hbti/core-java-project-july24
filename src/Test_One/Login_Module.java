package Test_One;

public class Login_Module
{
    public static void main(String[] args)
    {

        // Users List from Banking Software
        String PersonOne ="ADMIN";
        String PersonTwo ="USER";
        String PersonThree ="BANKER";

        // Users Passes from Banking Software
        String ADMIN_PASS ="Admin";
        String USER_PASS ="User";
        String BANKER_PASS ="Bank";

        // User: ADMIN and Pass: Admin
        PersonOne ="ADMIN";
        ADMIN_PASS ="Admin";

        if(PersonOne =="ADMIN" && ADMIN_PASS =="Admin")
        {
            System.out.println("You have successfully logged in");
        }
        else
        {
            System.out.println("Please check the details you already mention");
        }

        // User: USER and Pass: User
        PersonTwo ="USER";
        USER_PASS ="User";

        if(PersonTwo =="USER" && USER_PASS =="User")
        {
            System.out.println("You have successfully logged in");
        }
        else
        {
            System.out.println("Please check the details you already mention");
        }

        // User: BANK and Pass: Bank
        PersonThree ="BANK";
        BANKER_PASS ="Bank";

        if(PersonThree =="BANK" && BANKER_PASS =="Bank")
        {
            System.out.println("You have successfully logged in");
        }
        else
        {
            System.out.println("Please check the details you already mention");
        }
    }
}
