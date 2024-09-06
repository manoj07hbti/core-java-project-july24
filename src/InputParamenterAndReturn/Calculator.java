package InputParamenterAndReturn;

public class Calculator
{
    public int Addition(int ValueA, int ValueB)
    {
        int Sum= ValueA+ValueB;
        return Sum;
    }
    public int Subtraction(int ValueA, int ValueB)
    {
        int Sum= ValueA-ValueB;
        return Sum;
    }
    public int Multiplication(int ValueA, int ValueB)
    {
        int Sum= ValueA*ValueB;
        return Sum;
    }
    public int Division(int ValueA, int ValueB)
    {
        int Sum= ValueA/ValueB;
        return Sum;
    }

    public static void main(String[] args)
    {
        Calculator data= new Calculator();

        int AdditionResult= data.Addition(6,4);
        System.out.println("After adding the given values, here is the sum: "+AdditionResult);

        int SubtractionResult= data.Subtraction(26,10);
        System.out.println("After subtracting the ValueB from ValueA, here is the sum: "+SubtractionResult);

        int MultiplicationResult= data.Multiplication(6,4);
        System.out.println("After multiplying the values into each other, here is the sum: "+MultiplicationResult);

        int DivisionResult= data.Division(14,7);
        System.out.println("After dividing the ValueA by ValueB, here is the sum: "+DivisionResult);
    }
}
