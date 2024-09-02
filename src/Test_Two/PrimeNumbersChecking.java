package Test_Two;

public class PrimeNumbersChecking
{
    public static void main(String[] args)
    {
        int Value;
        int Count;

        // Change this number to check if it's prime
        Value= 1;
        Count= 0;

        for (int i = 1; i <= Value; i++) {
            if (Value % i == 0) {
                Count++;
            }
        }

        if (Count == 2)
        {
            System.out.println(Value+ " is a prime number");
        }else
        {
            System.out.println(Value+ " is not a prime number");
        }

    }
}
