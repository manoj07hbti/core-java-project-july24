package Test_One;

public class Withdraw_Money
{
    public static void main(String[] args)
    {
        int Amount =0;
        int AmountLimit =10000;

        //A code to withdrawing amount of the user
        Amount=0;
        if(Amount>0 && Amount%100 ==0)
        {
            if(Amount<= 10000)
            {
                System.out.println("You've successfully withdraw your amount");
            }
            else
            {
                System.out.println("We are not able to withdraw amount more than 10000");
            }
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }
}
