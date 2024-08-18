package Test_Three;

public class CheckingEvenAndOdd
{
    public static void main(String[] args)
    {
        int Value = 78;

        if (Value >= 10 && Value <= 300)
        {
            if (Value % 2 == 0)
            {
                System.out.println(Value + " is Even");
            }
            else
            {
                System.out.println(Value + " is Odd");
            }
        }
        else
        {
            System.out.println("The number is out of the range 10 to 300.");
        }

    }
}
