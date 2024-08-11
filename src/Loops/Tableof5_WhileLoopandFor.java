package Loops;

public class Tableof5_WhileLoopandFor
{
    public static void main(String[] args)
    {
        int Starting= 5;
        int Ending;

        for(int i=1; i<=10; i++)
        {
            Ending= Starting*i;

            System.out.println("ForLoop...5 x "+i+" =  "+Ending);
        }
        int num = 5;
        int i = 1;

        while (i <= 10) {
            System.out.println("WhileLoop...5 x "+i+ " = " + (num*i));
            i++;
        }

    }
}
