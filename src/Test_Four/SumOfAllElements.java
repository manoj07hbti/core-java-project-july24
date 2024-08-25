package Test_Four;

public class SumOfAllElements
{
    public static void main(String[] args)
    {
        int Element[] = {1, 2, 3, 4, 5};
        int Value = 0;

        for(int X = 0; X < Element.length; X++)
        {
            Value = Value+Element[X];
        }

        System.out.println(Value);

    }
}
