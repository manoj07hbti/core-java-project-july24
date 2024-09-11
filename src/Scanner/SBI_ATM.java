package Scanner;

import java.util.Scanner;

public class SBI_ATM {

    public void ATMAPP() {

        Scanner scanner = new Scanner(System.in); //we have created object of Scanner class
        System.out.println("welcome to SBI BANK : ");
        String name = scanner.nextLine(); // it reads String input and return you the value
        System.out.println("Sbi bank ATM");

        int balance = 5000, withdraw, deposit;
        Scanner scanner1 = new Scanner(System.in);
        while (true) {

            System.out.println("withdraw for 1");
            System.out.println("deposit for 2");
            System.out.println("check balance for 3");
            System.out.println("to exit for 4");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("withdrawl the amount");
                    withdraw = scanner.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("collect your amount");

                    } else {
                        System.out.println("balance Insufficient");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter amount to deposit..");
                    deposit = scanner.nextInt();
                    balance = balance + deposit;
                    System.out.println("amount is deposited");
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

        SBI_ATM obj = new SBI_ATM();
        obj.ATMAPP();

        String SBI_ATM = "Y";
        while (SBI_ATM.equals("Y")) {
            System.out.println("Welcome to SBI ATM.....Please ente your sbi bank 01 withdrawl cash, 02-balance check 03-deposit 04- exit");

            Scanner scanner = new Scanner(System.in);
            int sbi= scanner.nextInt();

            if (sbi == 1) {
                //call withdrawl
                System.out.println(obj.withdrawl ());
                //call balance
            } else if (sbi == 2) {
                System.out.println(obj.balance ());
                //call deposit
            } else if (sbi == 3) {
                System.out.println(obj.deposit());
                //call exit
            } else if (sbi == 4) {
                System.out.println(obj.exit());
            } else {
                System.out.println("Not found account values..");
            }
        }

        System.out.println("Do you want to continue press Y and not press N");
        Scanner scanner_1 = new Scanner(System.in);
        SBI_ATM = scanner_1.nextLine();



    }
    private boolean withdrawl() {
        return false;
    }
    private boolean balance() {
        return false;
    }
    private boolean deposit() {
        return false;
    }
    private boolean exit() {
        return false;
    }

}
