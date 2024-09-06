package InputParamenterAndReturn;

public class EvenOrOdd
{
    public boolean FindingEvenOrOdd(int Value)
    {
        if(Value%2==0)
        {
            return true;
        }else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        EvenOrOdd data = new EvenOrOdd();
        boolean Detection = data.FindingEvenOrOdd(313);
        System.out.println(Detection);

        if(Detection)
        {
            System.out.println("The number is even");
        }else
        {
            System.out.println("The number is odd");
        }
    }
}
