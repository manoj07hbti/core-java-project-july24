package test_15_september;

import java.util.Scanner;

public class Atm {
    public String cashwithdrawl() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the cash withdrawl amount:");
        int balance = 500000;
        int amount = scanner.nextInt();
        if (balance > amount) {
            if (amount % 100 == 0) {
                balance = balance - amount;
                result = "your  withdrawl amount is: " + amount + " and your remaining balance is: " + balance;
            } else {
                result = "insufficient balance.." + balance;
            }

        }
        return result;
    }

    public String balancecheck() {
        String result = " ";
        double balance = 40000.63;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" balance:" + balance);
        return result;
    }

    public String deposit() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter deposit amount");
        double balance = 40000.63;
        double amount = scanner.nextDouble();
        balance = amount + balance;
        System.out.println("Deposited successfully: your  total available balance is:" + balance);
        return result;
    }

    public String exist() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        result = "Thank you";
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to SBI bank");

        System.out.println("enter your pin number...");
        int pin = 1786;
        int p = scanner.nextInt();
        if (p == 1786) {
            System.out.println("pin number is correct...");
        } else {
            System.out.println("please enter valid pin number ..");
        }
        scanner = new Scanner(System.in);
        System.out.println("please choose an option...1)cash withdrawl, 2)balance check, 3)deposit, 4)exit");

        String re_choice = "Y";
        while (re_choice.equals("Y")) {
            scanner = new Scanner(System.in);

            Scanner scanner_1 = new Scanner(System.in);
            int choice = scanner_1.nextInt();
            scanner.Atm obj = new scanner.Atm();


            if (choice == 1) {
                //call cash withdrawl
                System.out.println(obj.cashwithdrawl());
            } else if (choice == 2) {
                //call balance check
                System.out.println(obj.balancecheck());
            } else if (choice == 3) {
                //call deposit
                System.out.println(obj.deposit());
            } else if (choice == 4) {
                //call exist
                System.out.println(obj.exist());
            }

            System.out.println("Do you want to continue press Y and and please choose an option...1)cash withdrawl, 2)balance check, 3)deposit, 4)exit...");
            Scanner scanner_2 = new Scanner(System.in);
            re_choice = scanner_2.nextLine();

        }

    }
}