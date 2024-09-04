package ThriceDataByMethods;

public class Factorial
{
    public void FactorialOfAValue(int Value)
    {
        int Result= 1;
        for(int i=Value; i>0 ; i--)
        {
            Result=Result*i;
        }
        System.out.println("Factorial of given Number "+Value +" is "+Result);
    }

    public static void main(String[] args)
    {
        Factorial data = new Factorial();
        data.FactorialOfAValue(5);
    }
}
