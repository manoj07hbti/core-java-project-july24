package Test_Six;

import java.util.Scanner;

public class ATMProgram
{
    private int TotalBalance= 10000;

    public void CashWithdraw()
    {
        System.out.println("Please enter the withdrawing amount:");
        Scanner scanner= new Scanner(System.in);
        int Amount= scanner.nextInt();

        if(Amount % 100==0 && Amount <= TotalBalance)
        {
            TotalBalance-= Amount;
            System.out.println("You successfully withdrawn "+Amount+" INR, here is your new total balance: "+TotalBalance);
        }else if(Amount % 100==0 && Amount >= TotalBalance)
        {
            System.out.println("Insufficient balance");
        }else
        {
            System.out.println("Invalid amount (Enter an amount of multiple of 100)");
        }
    }
    public void BalanceCheck()
    {
        System.out.println("Your total balance is "+TotalBalance+" INR");
    }
    public void DepositMoney()
    {
        System.out.println("Please enter the depositing amount:");
        Scanner scanner= new Scanner(System.in);
        int Deposit= scanner.nextInt();

        TotalBalance+= Deposit;
        System.out.println(Deposit+" INR has been deposit to your account successfully. New Balance: "+TotalBalance+" INR");
    }
    public void ExitApplication()
    {
        System.out.println("Exiting Application...");
    }

    public static void main(String[] args)
    {
        String Continuation= "Y";
        System.out.println("Welcome to XYZ Bank, Please enter your PIN:");
        Scanner scanner= new Scanner(System.in);
        int PIN= scanner.nextInt();

        ATMProgram obj= new ATMProgram();

        while (Continuation.equalsIgnoreCase("Y"))
        {
            if (PIN == 3333)
            {
                System.out.println("1- Cash Withdraw, 2- Balance Check, 3- Money Deposit, 4- Exit");
                int Decision = scanner.nextInt();

                switch (Decision)
                {
                    case 1:
                        obj.CashWithdraw();
                        break;
                    case 2:
                        obj.BalanceCheck();
                        break;
                    case 3:
                        obj.DepositMoney();
                        break;
                    case 4:
                        obj.ExitApplication();
                        Continuation= "N";
                        break;
                }
                if (!Continuation.equals("N"))
                {
                    System.out.println("Do you want to continue? Y or any other key to exit");
                    Continuation= scanner.next();
                }
            } else
            {
                System.out.println("Please try again");
                PIN = scanner.nextInt();
            }
        }
    }
}
