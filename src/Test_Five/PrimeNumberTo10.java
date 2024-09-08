package Test_Five;

public class PrimeNumberTo10
{
    public void CheckingPrime(int Value)
    {
        if(Value<=10)
        {
            int Count=0;
            for(int i=1; i<=Value; i++)
            {
                if(Value%i==0)
                {
                    Count++;
                }
            }
            if(Count==2)
            {
                System.out.println(Value+" is a prime number");
            }else
            {
                System.out.println(Value+" is not a prime number");
            }
        }else
        {
            System.out.println("Please enter value between 1-10");
        }
    }

    public static void main(String[] args)
    {
        PrimeNumberTo10 data= new PrimeNumberTo10();
        data.CheckingPrime(9);
    }
}
