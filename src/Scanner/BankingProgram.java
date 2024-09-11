package Scanner;

import java.util.Scanner;

public class BankingProgram {
    // Class variables to track balance and ATM status
    private int balance= 30000;

    public void cashWithdraw() {
        System.out.println("Please enter the withdrawal amount (multiples of 100):");
        Scanner scanner= new Scanner(System.in);
        int amount= scanner.nextInt();

        if (amount % 100== 0 && amount <= balance) {
            balance-= amount;
            System.out.println("You have successfully withdrawn " + amount + " INR. Your new balance is " + balance + " INR.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Please enter a multiple of 100.");
        }
    }

    public void balanceCheck() {
        System.out.println("Your current balance is " + balance + " INR.");
    }

    public void moneyDeposit() {
        System.out.println("Please enter the deposit amount:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        balance += amount;
        System.out.println("You have successfully deposited " + amount + " INR. Your new balance is " + balance + " INR.");
    }

    public void exitApplication() {
        System.out.println("Exiting application...");
    }

    public static void main(String[] args) {
        String reChoice = "Y";
        System.out.println("Hello, Welcome to our Banking Program. Please enter your PIN:");
        Scanner scanner = new Scanner(System.in);
        int pin = scanner.nextInt();

        BankingProgram obj = new BankingProgram();  // Only create the object once

        while (reChoice.equalsIgnoreCase("Y")) {
            if (pin == 1234) {
                System.out.println("Select an option: 1- Cash Withdraw, 2- Balance Check, 3- Money Deposit, 4- Exit");
                int decision = scanner.nextInt();

                switch (decision) {
                    case 1:
                        obj.cashWithdraw();
                        break;
                    case 2:
                        obj.balanceCheck();
                        break;
                    case 3:
                        obj.moneyDeposit();
                        break;
                    case 4:
                        obj.exitApplication();
                        reChoice = "N";  // Exit the loop
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }

                if (!reChoice.equals("N")) {  // Only ask to continue if not exiting
                    System.out.println("Do you want to continue? Y or any other key to exit");
                    reChoice = scanner.next();
                }

            } else {
                System.out.println("Incorrect PIN, try again.");
                pin = scanner.nextInt();  // Allow retry for PIN
            }
        }
    }
}
