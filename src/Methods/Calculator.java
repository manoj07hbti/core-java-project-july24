package Methods;

public class Calculator
{
    public void Addition()
    {
        int ValueOne=1;
        int ValueTwo=5;

        int Sum= ValueOne+ValueTwo;
        System.out.println("After adding "+ValueOne+" and "+ValueTwo+", Here is the output: "+Sum);
    }
    public void Subtraction()
    {
        int ValueOne=5;
        int ValueTwo=7;

        int Sum= ValueOne-ValueTwo;
        System.out.println("After subtracting "+ValueOne+" and "+ValueTwo+", Here is the output: "+Sum);
    }
    public void Divide()
    {
        int Dividend=8;
        int Divisor=2;

        int Quotient=Dividend/Divisor;
        System.out.println("After diving "+Dividend+" by "+Divisor+", Here is the Quotient: "+Quotient);
    }
    public void Multiply()
    {
        int ValueOne=4;
        int ValueTwo=7;

        int Sum=ValueOne*ValueTwo;
        System.out.println("After multiplying "+ValueOne+" by "+ValueTwo+", Here is the output: "+Sum);
    }

    public static void main(String[] args)
    {
        Calculator data = new Calculator();
        data.Addition();
        data.Subtraction();
        data.Divide();
        data.Multiply();
    }
}
