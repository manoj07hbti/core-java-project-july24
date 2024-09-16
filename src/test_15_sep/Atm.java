package test_15_sep;

import java.util.Scanner;

public class Atm{

    double balance=10000 ;


    public String cashwithdrwal() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter cash withdrawal amount..");
      double amount = scanner.nextDouble();
        if (balance > amount) {
            if (amount % 100 == 0) {
                balance = balance - amount;
                result = "cash withdrawal amount is :" + amount + " " + "and remaning amount is:" + balance;
            } else {
                result = "please enter valid amount ,it is not multiple of 100:" + amount;
            }
        } else {
            result = "insufficient balance, can't withdraw:" + balance;
        }

        return result;
    }

    public String deposit() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter cash deposit amount..");
        double d = scanner.nextDouble();
       balance= balance + d;
        result = "your deposit amount is:" + d + " " + "total balance is :" +balance;
        return result;
    }

    public String checkbalance() {
        String result = "your balance is:" + balance;
        return result;
    }

    public String exit() {
        String result = "you are exist from menu, thanku for using sbi service";
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO BOB BANK...");

        System.out.println("please enter your pin...");
        int pin = 3333;
        int pin_1 = scanner.nextInt();
        if (pin_1 == pin) {
            System.out.println("pin is correct");
        } else {
            System.out.println("sorry, invalid pin...");
        }

        System.out.println("please choose an option...1)cash withdrawl,2)deposit, 3)check balance,4)exit...");

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

            System.out.println("for continue press Y and choice one option .1)cash withdrawl,2)deposit, 3)check balance,4)exit... or to exist press other alphabet other than Y....");
            scanner = new Scanner(System.in);
            choice = scanner.nextLine();
        }
    }
}
