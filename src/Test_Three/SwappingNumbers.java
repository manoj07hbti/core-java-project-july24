package Test_Three;

public class SwappingNumbers
{
    public static void main(String[] args)
    {
        int A=2;
        int B=4;

        A=A+B;
        B=A-B;
        A=A-B;

        System.out.println("You swapped the value A to "+A+" and B to "+B);
    }
}
