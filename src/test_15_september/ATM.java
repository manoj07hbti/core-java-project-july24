package test_15_september;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {

    public void CreateATM(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("WELCOME TO ATM");
        String name=scanner.nextLine();
        System.out.println("WELCOME TO PUNJAB NATIONAL BANK");
        int pin= scanner.nextInt(3333);


        int balance = 200000, deposit, withdraw;
        Scanner scanner1= new Scanner(System.in);

        while (true){
            System.out.println("Choice 1 withdraw");
            System.out.println("Choice 2 deposit");
            System.out.println("Choice 3 Check balance");
            System.out.println("Choice 4 to exit");
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println("ENTER MONEY TO WITHDRAW");
                    withdraw= scanner.nextInt();
                    if (balance>=withdraw){
                        balance=balance-withdraw;
                        System.out.println("COLLECT YOUR CASE");

                    }else {
                        System.out.println();
                        break;
                    }
                case 2:

                    System.out.println("ENTER MONEY TO DEPOSIT");
                    deposit=scanner.nextInt();
                    balance=balance+deposit;
                    System.out.println("MONEY SUCCESSFULLY DEPOSIT ");
                    System.out.println();
                    break;

                case 3:

                    System.out.println("balance"+ balance);
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);
            }
        }

    }

    public static void main(String[] args) {
        ATM obj= new ATM();
        obj.CreateATM();

    }

}
