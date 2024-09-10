package scanner;

import java.util.Scanner;

public class Atm {

    public void createAtm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME Sir/Madam..");
        String name = scanner.nextLine();
        System.out.println("Welcome to SBI bank ATM..");

        int balance = 100000, withdraw, deposit;
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 to exit ");
            System.out.println("Choose the operation you want to perform");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Enter the money to be withdrawn");
                    withdraw = scanner.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("collect your money");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter money to deposit..");
                    deposit = scanner.nextInt();
                    balance = balance + deposit;
                    System.out.println("Money is successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);

            }


        }
    }

    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.createAtm();
    }
}
