package Scanner;

import java.util.Scanner;

public class BankingSystem {
    public boolean CashWithdrawing()
    {
        System.out.println("Please enter your amount of withdrawing the cash:");
        Scanner scanner = new Scanner(System.in);
        int CashWithdraw = scanner.nextInt();

        if (CashWithdraw % 100 == 0)
        {
            System.out.println("You have successfully withdraw " + CashWithdraw + " from your account");
            System.out.println("Thank you for using our program :)");
            return true;

        } else
        {
            System.out.println("Invalid amount (Enter a amount which is divisible by 100)");
            return false;
        }

    }
    public boolean BalanceChecking()
    {
        int TotalMoney= 30000;
        System.out.println("Your balance is "+TotalMoney+" INR");
        return BalanceChecking();
    }
    public boolean MoneyDepositing()
    {
        System.out.println("Please enter the amount of depositing:");
        Scanner scanner= new Scanner(System.in);
        int Amount= scanner.nextInt();

        if(Amount% 100==0)
        {
            System.out.println("You have successfully deposited "+Amount+" INR in your account, Thank You");
        }else
        {
            System.out.println("Invalid amount (Enter an amount which is divisible by 100)");
        }
        return MoneyDepositing();
    }
    public boolean ExitingApplication()
    {
        System.out.println("Do you want to exit? Y for continue and any other key for exiting");
        Scanner scanner2= new Scanner(System.in);
        String Choice= scanner2.nextLine();

        if(Choice== "Y"){
            Choice= scanner2.nextLine();
        }else
        {
            System.out.println("Exiting application...");
        }
        return ExitingApplication();
    }


    public static void main(String[] args) {
        String ReChoice = "Y";
        while (ReChoice.equals("Y"))
        {
            System.out.println("Hi, Welcome to our Banking Program");
            System.out.println("Please enter your PIN here:");
            Scanner scanner = new Scanner(System.in);
            int PIN = scanner.nextInt();

            BankingSystem obj= new BankingSystem();

            if (PIN == 7890)
            {
                System.out.println("You have the access of your account, please choose an option");
                System.out.println("1- Cash Withdraw, 2- Balance Check, 3- Deposit, 4- Exit");
                Scanner scanner1 = new Scanner(System.in);
                int Decision = scanner1.nextInt();


                if (Decision == 1) {
                    System.out.println(obj.CashWithdrawing());
                } else if (Decision == 2) {
                    System.out.println(obj.BalanceChecking());
                } else if (Decision == 3) {
                    System.out.println(obj.MoneyDepositing());
                } else if (Decision == 4) {
                    System.out.println(obj.ExitingApplication());
                }

            } else
            {
                System.out.println("Please enter your PIN correctly");
                System.out.println("Do you want to re enter your PIN? Y for continue and other key for exiting");
                Scanner scanner1 = new Scanner(System.in);
                String ReTry = scanner1.nextLine();

                if (ReTry.equals("Y"))
                {
                    Scanner scanner2= new Scanner(System.in);
                    ReChoice= scanner2.nextLine();
                }else
                {
                    System.out.println("Exiting application...");
                }

            }
        }
    }
}
