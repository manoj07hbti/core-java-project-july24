package Test_Five;

public class DivisibleBy9From3To160AndOdd
{
    public void checkNumber(int Value)
    {
        if (Value>= 3 && Value<= 160)
        {
            if(Value% 9 == 0 && Value% 2 == 0)
            {
                System.out.println(Value+" is divisible by 9 and is even.");
            }else
            {
                System.out.println(Value+" does not meet the criteria of program (Can be odd or not divisible by 9)");
            }
        }else
        {
            System.out.println(Value+" Please enter a value between 3 to 160");
        }
    }

    public static void main(String[] args)
    {
        DivisibleBy9From3To160AndOdd obj = new DivisibleBy9From3To160AndOdd();
        obj.checkNumber(126);
    }
}
