package scanner;

import java.util.Scanner;

public class MakeATM {


    public void MakeAtm() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO ATM");
        String name = scanner.nextLine();
        System.out.println("WELCOME TO AXIS ATM");


        int balance = 20000, deposit, withdraw;
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Choice 1 withdraw");
            System.out.println("Choice 2 Check Balance");
            System.out.println("Choice 3 Deposit");
            System.out.println("Choice 4 Exit");
            System.out.println("Choice 1 withdraw");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Enter Money To Withdrawal");
                    withdraw = scanner.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Collect your money");
                    } else {
                        System.out.println();
                        break;
                    }

                case 2:

                    System.out.println("Enter money to Deposit");
                    deposit = scanner.nextInt();
                    balance = balance + deposit;
                    System.out.println("Money is successfully deposit");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Balance:" + balance);
                    System.out.println();
                    break;


                case 4:
                    System.exit(0);

            }


        }


    }

    public static void main(String[] args) {

        MakeATM obj = new MakeATM();
        obj.MakeAtm();

    }

}
