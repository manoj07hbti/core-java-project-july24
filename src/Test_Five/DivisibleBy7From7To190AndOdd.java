package Test_Five;

public class DivisibleBy7From7To190AndOdd
{
    public void checkNumber(int Value)
    {
        if (Value>= 7 && Value<= 190)
        {
            if(Value% 7 == 0 && Value% 2 == 0)
            {
                System.out.println(Value+" is divisible by 7 and is even.");
            }else
            {
                System.out.println(Value+" does not meet the criteria of program (Can be odd or not divisible by 7)");
            }
        }else
        {
            System.out.println(Value+" Please enter a value between 7 to 190");
        }
    }

    public static void main(String[] args)
    {
        DivisibleBy7From7To190AndOdd obj = new DivisibleBy7From7To190AndOdd();
        obj.checkNumber(56);
    }
}
