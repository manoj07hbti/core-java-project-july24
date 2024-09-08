package Test_Five;

public class PrimeNumber10To20
{
    public void CheckingPrime(int Value)
    {
        if(Value<=20)
        {
            int Count=0;
            for(int i=10; i<=20; i++)
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
            System.out.println("Please enter value between 10-20");
        }
    }

    public static void main(String[] args)
    {
        PrimeNumberTo10 data= new PrimeNumberTo10();
        data.CheckingPrime(9);
    }
}
