package Practice;

import java.util.Scanner;

public class ScannerInput
{
    public void InputName()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter your name here: ");
        String Name= data.nextLine();
        System.out.println("You have entered your name as "+Name);
    }
    public void InputAge()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter your age here: ");
        int Age= data.nextInt();
        System.out.println("You have entered your age as "+Age);
    }
    public void InputGender()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter your Gender here: ");
        String Gender= data.nextLine();
        System.out.println("You have entered your gender as "+Gender);
    }
    public void InputWeight()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter your weight here: ");
        boolean Weight= data.nextBoolean();
        System.out.println("You have entered your weight as "+Weight);
    }
    public void InputAddress()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter your address here: ");
        String Address= data.nextLine();
        System.out.println("You entered your address as "+Address);
    }
    public void InputOccupation()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter your occupation here: ");
        String Occupation= data.nextLine();
        System.out.println("You have entered your occupation as "+Occupation);
    }
    public void InputSalary()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter your salary here: ");
        boolean Salary= data.hasNextDouble();
        System.out.println("You have entered your salary of "+Salary);
    }

    public static void main(String[] args)
    {
        ScannerInput data= new ScannerInput();
        data.InputName();
        data.InputAge();
        data.InputGender();
        data.InputWeight();
        data.InputAddress();
        data.InputOccupation();
        data.InputSalary();
    }
}