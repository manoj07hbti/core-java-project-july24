package Test_Five;

public class PrintingSquare
{
    public void SquareFinder(int Value)
    {
        if(Value<=10)
        {
            int Sum= Value*Value;
            System.out.println("Here is the cube of "+Value+": "+Sum);
        }else
        {
            System.out.println("Please enter value between 1-10");
        }
    }

    public static void main(String[] args)
    {
        PrintingSquare data= new PrintingSquare();
        data.SquareFinder(9);
    }
}
