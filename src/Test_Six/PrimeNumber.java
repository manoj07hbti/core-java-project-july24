package Test_Six;

import java.util.Scanner;

public class PrimeNumber
{

    public void CheckingNumber()
    {
        int value;
        int count = 0;

        System.out.println("Please enter a specific number");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();

        for (int i = 1; i <= value; i++)
        {
            if (value % i == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            System.out.println(value + " is a prime number");
        } else
        {
            System.out.println(value + " is not a prime number");
        }
    }

    public static void main(String[] args)
    {
        String reChoice = "Y";
        Scanner scanner = new Scanner(System.in);
        PrimeNumber obj = new PrimeNumber();

        System.out.println("Do you want to find Prime Number? Y (Yes) or any other key to exit...");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y"))
        {
            obj.CheckingNumber();

            while (reChoice.equalsIgnoreCase("Y"))
            {
                System.out.println("Do you want to check another number? Y (Yes) or any other key to exit...");
                reChoice = scanner.next();

                if (reChoice.equalsIgnoreCase("Y"))
                {
                    obj.CheckingNumber();
                } else
                {
                    System.out.println("Exiting application...");
                }
            }
        } else
        {
            System.out.println("Exiting application...");
        }

    }
}
