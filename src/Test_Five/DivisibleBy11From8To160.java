package Test_Five;

public class DivisibleBy11From8To160
{
    public void checkNumber(int Value)
    {
        if (Value>= 8 && Value<= 160)
        {
            if(Value% 11 == 0 && Value% 2 == 0)
            {
                System.out.println(Value+" is divisible by 11 and is even.");
            }else
            {
                System.out.println(Value+" does not meet the criteria of program (Can be odd or not divisible by 11)");
            }
        }else
        {
            System.out.println(Value+" Please enter a value between 8 to 160");
        }
    }

    public static void main(String[] args)
    {
        DivisibleBy11From8To160 obj = new DivisibleBy11From8To160();
        obj.checkNumber(125);
    }
}
