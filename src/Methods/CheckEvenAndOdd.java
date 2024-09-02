package Methods;

public class CheckEvenAndOdd
{
    public void EvenOrOdd()
    {
        int Value= 35;

        if(Value%2==0)
        {
            System.out.println("The Number is even: "+Value);
        }else
        {
            System.out.println("The Number is odd: "+Value);
        }
    }

    public static void main(String[] args)
    {
        CheckEvenAndOdd data = new CheckEvenAndOdd();
        data.EvenOrOdd();
    }
}