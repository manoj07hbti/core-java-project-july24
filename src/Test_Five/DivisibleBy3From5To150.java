package Test_Five;

public class DivisibleBy3From5To150
{
    public void isDivisibleByThreeAndOdd(int Value)
    {
        if(Value>= 5 && Value<= 150)
        {
            if (Value% 3== 0 && Value% 2 != 0)
            {
                System.out.println(Value+" is divisible by 3 and odd");
            } else
            {
                System.out.println(Value+" is not divisible by 3 and odd");
            }
        }else
        {
            System.out.println(Value+" Please enter a value between 5 to 150");
        }
    }

    public static void main(String[] args)
    {
        DivisibleBy3From5To150 obj = new DivisibleBy3From5To150();
        obj.isDivisibleByThreeAndOdd(56);
    }
}
