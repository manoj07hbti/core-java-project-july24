package Exceptions;

public class AccountOpening
{
    public String minimumCharges(int charges) throws MinimumBalance
    {
        if (charges>= 5000)
        {
            return "You can continue to open your account";
        }
        else
        {
            throw new MinimumBalance("Amount should be greater or equal to 5000 to open an account");
        }
    }
    public static void main(String[] args)
    {
        AccountOpening obj= new AccountOpening();
        try {
            obj.minimumCharges(4000);
        } catch (MinimumBalance e) {
            System.out.println("Error occurred// "+e);
        }
    }
}
