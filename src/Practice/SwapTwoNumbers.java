package Practice;

public class SwapTwoNumbers
{
    public static void main(String[] args)
    {
        int X= 1;
        int Y= 2;

        X=X+Y;
        Y=X-Y;
        X=X-Y;

        System.out.println("You swapped the value X to "+X+" and the value Y to "+Y);
    }
}
