package ThriceDataByMethods;

public class PrintingCube
{
    public void MakeCube(int Value)
    {
        System.out.println("The Cube of "+Value+" is: "+Value*Value*Value);
    }

    public static void main(String[] args)
    {
        PrintingCube data = new PrintingCube();
        data.MakeCube(6);
        data.MakeCube(2);
        data.MakeCube(4);
    }
}
