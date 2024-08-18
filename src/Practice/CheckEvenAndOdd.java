package Practice;

public class CheckEvenAndOdd
{
    public static void main(String[] args)
    {
        int Number= 33;

        if (Number >= 5 && Number <= 50)
        {
            if (Number %2 ==0)
            {
                System.out.println(Number+" number is even");
            }
            else
            {
                System.out.println(Number+" number is odd");
            }
        }
        else {
            System.out.println("Please enter a value between 5 to 50");
        }
    }
}
