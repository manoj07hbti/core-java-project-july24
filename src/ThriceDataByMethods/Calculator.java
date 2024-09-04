package ThriceDataByMethods;

public class Calculator
{
    public void addition(int ValueA, int ValueB)
    {
        int Sum= ValueA+ValueB;
        System.out.println("You are adding "+ValueA+" and "+ValueB+", here is the output: "+Sum);
    }
    public void subtraction(int ValueA, int ValueB)
    {
        int Sum= ValueA-ValueB;
        System.out.println("You are subtracting "+ValueA+" by "+ValueB+", here is the output: "+Sum);
    }
    public void multiplication(int ValueA, int ValueB)
    {
        int Sum= ValueA*ValueB;
        System.out.println("You are multiplying "+ValueA+" into "+ValueB+", here is the output: "+Sum);
    }
    public void division(int ValueA, int ValueB)
    {
        int Sum= ValueA/ValueB;
        System.out.println("You are dividing "+ValueA+" by "+ValueB+", here is the output: "+Sum);
    }

    public static void main(String[] args)
    {
        Calculator adding = new Calculator();
        adding.addition(2, 3);
        adding.addition(9,2);
        adding.addition(3,8);

        Calculator subtracting = new Calculator();
        subtracting.subtraction(7,1);
        subtracting.subtraction(9,3);
        subtracting.subtraction(5,8);

        Calculator multiplying = new Calculator();
        multiplying.multiplication(4,9);
        multiplying.multiplication(5,5);
        multiplying.multiplication(7,2);

        Calculator dividing = new Calculator();
        dividing.division(39,3);
        dividing.division(82,4);
        dividing.division(32,12);
    }
}
