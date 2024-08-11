package Test_Two;

public class CheckEvenandOddNumbers
{
    public static void main(String[] args)
    {
        int Number=177;

        if (Number> 0)
        {
            if (Number%2 ==0)
            {
                System.out.println("The Number is even..." + Number);
            }
            else
            {
                System.out.println("The Number is odd..." + Number);
            }

        }else
        {
            System.out.println("Please enter a value");
        }
    }
}
