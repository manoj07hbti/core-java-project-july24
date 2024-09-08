package Test_Five;

public class PrintingCube
{
    public void CubeFinder(int Value)
    {
        if(Value<=10)
        {
            int Sum= Value*Value*Value;
            System.out.println("Here is the cube of "+Value+": "+Sum);
        }else
        {
            System.out.println("Please enter value between 1-10");
        }
    }

    public static void main(String[] args)
    {
        PrintingCube data= new PrintingCube();
        data.CubeFinder(2);
    }
}
