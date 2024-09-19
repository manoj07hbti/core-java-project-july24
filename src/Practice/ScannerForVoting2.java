package Practice;

import java.util.Scanner;

public class ScannerForVoting2
{
    public boolean InputAge()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your age:");
        int Age= scanner.nextInt();

        if(Age>=18)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public boolean InputCity()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your city:");
        String City= scanner.nextLine();

        if(City=="Agra")
        {
            return true;
        }else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        ScannerForVoting2 data= new ScannerForVoting2();
        data.InputAge();
        data.InputCity();
    }
}
