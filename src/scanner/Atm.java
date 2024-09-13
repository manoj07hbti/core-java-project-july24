package scanner;

import java.util.Scanner;

public class Atm {
    int balance = 50000;

    public String CashWithdraw() {
        Scanner cash = new Scanner(System.in);
        System.out.println("Please Enter value");
        int withdraw = cash.nextInt();
        if (withdraw % 100 == 0 && balance >= withdraw) {
            balance = balance - withdraw;
            System.out.println("Please collect your money: " + withdraw);
        } else {
            System.out.println("Insufficient balance / Invalid amount..please enter correct value");
        }
        return "Balance: " + balance;
    }

    public String CashDeposit() {
        Scanner cash = new Scanner(System.in);
        System.out.println("Please enter amount: ");
        int deposit = cash.nextInt();
        balance = balance + deposit;
        System.out.println("Your money has been successfully deposited: " + deposit);
        return "Balance: " + balance;
    }

    public String BalanceCheck() {
        return "Balance: " + balance;
    }

    public String Exit() {
        System.exit(4);
        return "";
    }

    public static void main(String[] args) {
        String choice1 = "Y";
        while (choice1.equals("Y")) {
            System.out.println("Welcome to XYZ Bank.");
            System.out.println("Please Enter your Pin");
            Scanner Pin = new Scanner(System.in);
            int pin = Pin.nextInt();
            if (pin == 3333) {
                System.out.println("1.Cash Withdraw  2.Cash Deposit  3.Balance Check 4.Exit");
            } else {
                System.out.println("Invalid PIN");
            }
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            Atm obj = new Atm();
            if (choice == 1) {
                System.out.println(obj.CashWithdraw());
            } else if (choice == 2) {
                System.out.println(obj.CashDeposit());
            } else if (choice == 3) {
                System.out.println(obj.BalanceCheck());
            } else if (choice == 4) {
                System.out.println(obj.Exit());
            }
            System.out.println("Do you want to continue:To continue press Y if not press any other number");
            Scanner scanner1 = new Scanner(System.in);
            choice1 = scanner1.nextLine();
        }
    }
}
