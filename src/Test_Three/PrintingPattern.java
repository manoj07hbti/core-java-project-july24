package Test_Three;

public class PrintingPattern
{
    public static void main(String[] args)
    {
        for (int i=1; i<=3; i++)
        {
            for (int j= 1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i= 2; i>= 1; i--)
        {
            for (int j= 1; j<= i; j++ )
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=1; i<=5; i++)
        {
            for (int j= 1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
