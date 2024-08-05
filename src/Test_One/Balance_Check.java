package Test_One;

public class Balance_Check
{
    public static void main(String[] args) {
        int UserBalance = 0;
        int LimitedBalance = 25000;

        //To check user's balance is more than 0

        UserBalance = 12000;
        if(UserBalance> 0)
        {
            System.out.println("The balance is more than 0...."+UserBalance);
        }
        else
        {
            System.out.println("The balance is 0");
        }

        //To check Balance is more than 10000
        if(UserBalance> 10000)
        {
            System.out.println("Please invest to FD");
        }

        //To check Balance b/w 5000 to 10000
        if(UserBalance>= 5000 || LimitedBalance<= 10000)
        {
            System.out.println("Total balance is: "+UserBalance);
        }

        //To check Balance less than 5000
        if(UserBalance< 5000)
        {
            System.out.println("Low balance: "+UserBalance);
        }
    }
}
