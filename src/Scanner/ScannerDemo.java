package Scanner;

import java.util.Scanner;

public class ScannerDemo
{
    public void InputName()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Welcome, please enter your name:");
        String Name= data.nextLine();
        System.out.println("You have entered your name as "+Name);
    }

    public void InputAge()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Enter your age here:");
        int Age= data.nextInt();
        System.out.println("You have entered your age of "+Age);
    }

    public void InputSalary()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Enter your salary here:");
        double Salary= data.nextDouble();
        System.out.println("You have entered your salary of "+Salary);
    }
    
    public static void main(String[] args)
    {
        ScannerDemo data= new ScannerDemo();
        data.InputName();
        data.InputAge();
        data.InputSalary();
    }
}
