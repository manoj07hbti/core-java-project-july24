package methods;

import java.util.Scanner;

public class AtmService {

    public String cashwithdrawl() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the cash withdrawl amount:");
        int balance = 10000;
        int amount = scanner.nextInt();
        if (balance > amount) {
            if (amount % 100 == 0) {
                balance = balance - amount;
                result = "your cash withdrawl amount is: " + amount + " and your remaning balance is: " + balance;
            } else {
                result = "its is not multiple of 100..please enter valid amount..";
            }
        } else {
            result = "insufficient balance.." + balance;
        }
        return result;
    }

    public String balancecheck() {
        String result = " ";
        double balance = 1025.3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("this is your updated balance:" + balance);
        return result;
    }

    public String deposit() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter deposit amount");
        double balance = 1025.3;
        double amount = scanner.nextDouble();
        balance = amount + balance;
        System.out.println("deposited successfully: total avaliable balance is:" + balance);
        return result;
    }

    public String exist() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        result = "exist from menu, thank uou for using SBI service..";
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to sbi bank");

            System.out.println("enter your pin...");
            int pin = 1234;
            int p = scanner.nextInt();
            if (p == 1234) {
                System.out.println("pin is correct...");
            } else {
                System.out.println("please enter valid pin...your pin is invalid.");
            }
            scanner = new Scanner(System.in);
            System.out.println("please choose an option...1)cash withdrawl, 2)balance check, 3)deposit, 4)exit");

            String re_choice = "Y";
            while (re_choice.equals("Y")) {
                scanner = new Scanner(System.in);

            Scanner scanner_1 = new Scanner(System.in);
            int choice = scanner_1.nextInt();
            AtmService obj = new AtmService();


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
