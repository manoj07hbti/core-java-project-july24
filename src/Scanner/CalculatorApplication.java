package Scanner;

import java.util.Scanner;

public class CalculatorApplication
{
    public String Addition()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter Value One: ");
        int ValueOne= data.nextInt();
        System.out.println("Please enter the Value Two: ");
        int ValueTwo= data.nextInt();
        int Sum= ValueOne+ValueTwo;
        return "After adding "+ValueOne+" with "+ValueTwo+", here is the sum: "+Sum;
    }
    public String Subtraction()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter Value One: ");
        int ValueOne= data.nextInt();
        System.out.println("Please enter the Value Two: ");
        int ValueTwo= data.nextInt();
        int Sum= ValueOne-ValueTwo;
        return "After subtracting "+ValueTwo+" from "+ValueOne+", here is the sum: "+Sum;
    }
    public String Multiplication()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter Value One: ");
        int ValueOne= data.nextInt();
        System.out.println("Please enter the Value Two: ");
        int ValueTwo= data.nextInt();
        int Sum= ValueOne*ValueTwo;
        return "After multiplying "+ValueOne+" into "+ValueTwo+", here is the sum: "+Sum;
    }
    public String Division()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter Value One: ");
        int ValueOne= data.nextInt();
        System.out.println("Please enter the Value Two: ");
        int ValueTwo= data.nextInt();
        int Sum= ValueOne/ValueTwo;
        return "After dividing "+ValueOne+" by "+ValueTwo+", here is the quotient: "+Sum;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Calculator, Please enter a number for a specific calculation. Add- 1, Sub- 2, Multiply- 3, Divide-4");
        Scanner data= new Scanner(System.in);
        int Decision= data.nextInt();

        CalculatorApplication Calculate= new CalculatorApplication();

        if(Decision==1)
        {
            System.out.println(Calculate.Addition());
        }else if(Decision==2)
        {
            System.out.println(Calculate.Subtraction());
        }else if(Decision==3)
        {
            System.out.println(Calculate.Multiplication());
        }else if(Decision==4)
        {
            System.out.println(Calculate.Division());
        }
    }
}
