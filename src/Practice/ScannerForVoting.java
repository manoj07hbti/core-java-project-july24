package Practice;

import java.util.Scanner;

public class ScannerForVoting
{
    public void InputName()
    {
        Scanner data= new Scanner(System.in);
        System.out.println("Please enter your name here:");
        String Name= data.nextLine();
        System.out.println("You entered your name as "+Name);
    }
    public void InputAgeAndCity()
    {
        Scanner data= new Scanner(System.in);

        System.out.println("Enter your Age:");
        int Age= data.nextInt();
        System.out.println("Your age is "+Age);

        System.out.println("Enter your City:");
        String City= data.nextLine();
        System.out.println("Your city is "+City);

        if(Age>=18 && City=="Pune")
        {
            System.out.println("You are eligible to vote in Pune");
        }else if (Age<18 && City=="Pune")
        {
            System.out.println("You are a minor and can't vote anywhere");
        }else if (Age>=18 && City=="")
        {
            System.out.println("You do not belong from Pune and you can't vote in Pune");
        }else
        {
            System.out.println("You do not belong from Pune and you're a minor, you can't vote anywhere");
        }

    }

    public static void main(String[] args)
    {
        ScannerForVoting data= new ScannerForVoting();
        data.InputName();
        data.InputAgeAndCity();
    }
}
