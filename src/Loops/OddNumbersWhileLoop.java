package Loops;

public class OddNumbersWhileLoop
{
    public static void main(String[] args)
    {
        int Value1= 1;

        while(Value1<=100)
        {
            if(Value1 %2 !=0)
            {
                System.out.println("Odd Numbers by While Loop..."+Value1);
            }
            Value1++;
        }
    }
}
