package conditional_statements;

public class NotOperator
{
    public static void main(String[] args)
    {
        //A Code to Check Which Numeral is Divisible by 3...

        int Number =14;
        if(Number> 0 && Number%3 ==0)
        {
            System.out.println("The Number is Divisible by 3...."+Number);
        }

        if(!(Number> 0 && Number%3 ==0))
        {
            System.out.println("The Number is Divisible by 3 by using Not Operator...."+Number);
        }

    }
}
