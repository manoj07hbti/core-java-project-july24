package scanner;

import java.util.Scanner;

public class AtmApp {

    public double withdrawl(double currBal){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Amount to Withdraw: ");
        int amount = sc.nextInt();

            if(amount % 100 == 0){
                System.out.println("Please Collect your Cash");
                System.out.println("Available Balance: " + (currBal-amount));
            } else {
                System.out.println("Please Enter Valid amount");
            }

            return currBal - amount;
    };

    public double deposit(double currBal){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Amount to Deposit: ");
        int amount = sc.nextInt();

        if(amount % 100 == 0){
            System.out.println("Cash Deposit Successfully");
            System.out.println("Available Balance: " + (currBal+amount));
        } else {
            System.out.println("Please Enter Valid amount");
        }

        return currBal + amount;
    };


    public static void main(String[] args) {
        AtmApp obj = new AtmApp();
        Scanner sc = new Scanner(System.in);

        int pin = 2004;
        int choice = 0;
        double balance= 6500.00;


        System.out.println("Welcome to PNB Bank Atm");
        System.out.println("Please Enter your pin");
        int enteredPin = sc.nextInt();


            if (pin == enteredPin) {
                while (choice != 4){

                        System.out.println("Please Enter your choice \n 1: Cash Withdrawl  2: Balance Check  3: Deposit  4: Exit Menu");
                        choice = sc.nextInt();

                        if(choice ==1 ){
                            double remaingBal=  obj.withdrawl(balance);
                            balance = remaingBal;
                        } else if (choice == 2) {
                            System.out.println("Your current balance is: " +balance);
                        } else if (choice == 3) {
                            double remainingBal = obj.deposit(balance);
                            balance = remainingBal;
                        } else {
                            break;
                        }



                }
            } else {
                System.out.println("Wrong Pin entered");
            }


        System.out.println("Thanks for using PNB ATM");


    }
}
