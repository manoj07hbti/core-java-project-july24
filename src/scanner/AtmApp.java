package scanner;

import java.util.Scanner;

public class AtmApp {

    public static void main(String[] args) {
        AtmApp obj = new AtmApp();
        Scanner sc = new Scanner(System.in);
        int pin = 2004;


        System.out.println("Welcome to PNB Bank Atm");
        System.out.println("Please Enter your pin");
        int enteredPin = sc.nextInt();

        if (pin == enteredPin) {
            {
                System.out.println("Please Enter your choice \n 1: Cash Withdrawl  2: Balance Check  3: Deposit  4: Exit Menu");
                int choice = sc.nextInt();

                if(choice == 1){
                    System.out.println("Please Enter Amount: ");
                    int amount= sc.nextInt();

                    if(amount % 100 == 0){
                        System.out.println("Please Collect your Cash");
                    } else {
                        System.out.println("Please Enter Valid amount");
                    }
                }
            }
        } else {
            System.out.println("Wrong Pin entered");
        }
    }
}
