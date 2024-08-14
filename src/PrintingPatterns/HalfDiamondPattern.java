package PrintingPatterns;

public class HalfDiamondPattern
{
    public static void main(String[] args)
    {
        for (int i=1; i<=4; i++)
        {
            for (int j= 1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i= 3; i>= 1; i--)
        {
            for (int j= 1; j<= i; j++ )
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
