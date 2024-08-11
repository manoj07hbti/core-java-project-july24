package Loops;

public class Tableof10_WhileLoopandFor
{
    public static void main(String[] args)
    {
        int Starting= 10;
        int Ending;

        for(int i=1; i<=10; i++)
        {
            Ending= Starting*i;

            System.out.println("ForLoop...10 x "+i+ " = "+Ending);
        }
        int num = 10;
        int i = 1;

        while (i <= 10) {
            System.out.println("WhileLoop...10 x "+i+ " = " + (num*i));
            i++;
        }
    }
}
