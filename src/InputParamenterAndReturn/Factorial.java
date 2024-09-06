package InputParamenterAndReturn;

public class Factorial
{
    public int FactorialFinder(int Value)
    {
            int Result= 1;
            for(int i= Value; i>0 ; i--)
            {
                Result= Result*i;
            }
        return Result;
    }

    public static void main(String[] args)
    {
        Factorial data= new Factorial();

        int Sum= data.FactorialFinder(5);
        System.out.println("Factorial of given Number is "+Sum);
    }
}
