package test_15_sept;

import java.util.Scanner;

public class Atm {

    int balance = 15000;


    public String cashwithdrwal() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter cash withdrawal amount..");
        int amount = scanner.nextInt();
        if (balance > amount) {
            if (amount % 100 == 0) {
                balance = balance - amount;
                result = "cash withdrawal amount is :" + amount + " " + "and remaning amount is:" + balance;
            } else {
                result = " enter valid amount :" + amount;
            }
        } else {
            result = "insufficient balance, cash is not withdraw:" + balance;
        }

        return result;
    }

    public String deposit() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter cash deposit amount..");
        int i = scanner.nextInt();
        balance = balance + i;
        result = "your deposit amount is:" + i + " " + "total balance is :" + balance;
        return result;
    }

    public String checkbalance() {
        String result = "your balance is:" + balance;
        return result;
    }

    public String exit() {
        String result = "you are exist from menu, thanks for using sbi Atm ";
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO Sbi BANK...");

        System.out.println("please enter your pin...");
        int pin = 01234;
        int pin_1 = scanner.nextInt();
        if (pin_1 == pin) {
            System.out.println("pin is correct");
        } else {
            System.out.println(" invalid pin...");
        }

        System.out.println("1... choosebcash withdrawl,...2...deposit,... 3..check balance,...4...exit...");

        String choice = "Y";
        while (choice.equals("Y")) {
            scanner = new Scanner(System.in);
            int pick = scanner.nextInt();

            Atm obj = new Atm();


            if (pick == 1) {
                //call cash withdrawl
                System.out.println(obj.cashwithdrwal());
            } else if (pick == 2) {
                //call deposit
                System.out.println(obj.deposit());
            } else if (pick == 3) {
                //call check balance
                System.out.println(obj.checkbalance());
            } else if (pick == 4) {
                //call exist
                System.out.println(obj.exit());
            }

            System.out.println("for continue press Y and..1.. choice ...2..cash withdrawl,....3...deposit, ...4..check balance,...exit... ...");
            scanner = new Scanner(System.in);
            choice = scanner.nextLine();
        }
    }
}
