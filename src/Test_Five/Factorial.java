package Test_Five;

public class Factorial
{
    public int Factor(int Value)
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
        int Sum =data.Factor(5);
        System.out.println("Here is the factorial of your given value: "+Sum);
    }
}
