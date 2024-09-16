package scanner_test;

import java.util.Scanner;

public class Atm {
    int balance=50000;
    public String withdraw(){
        Scanner wd=new Scanner(System.in);
        System.out.println("Please enter amount: ");
        int withdraw=wd.nextInt();
        if(withdraw%100==0){
            System.out.println("Please collect your cash");
        }else {
            System.out.println("Error please enter valid amount");
        }
        balance=balance-withdraw;
        return "Balance: "+balance;
    }
    public String balanceCheck(){
        return "Balance: "+balance;
    }
    public String deposit(){
        Scanner d=new Scanner(System.in);
        System.out.println("Please enter amount: ");
        int deposit=d.nextInt();
        System.out.println("Amount deposited");
        balance=balance+deposit;
        return "Balance: "+balance;
    }
    public boolean exit(){
        System.exit(4);
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to XYZ Bank ATM");
        System.out.println("Please enter your PIN: ");
        int pin=3333;
        Scanner Pin=new Scanner(System.in);
        pin= Pin.nextInt();
        if(pin==3333){
            System.out.println("1.Cash Withdraw" +
                    "           2.Balance Check" +
                    "           3.Deposit" +
                    "           4.Exit");
        }else {
            System.out.println("Invalid PIN");
        }
        Scanner scanner=new Scanner(System.in);
        Atm obj=new Atm();
        int choice=scanner.nextInt();
        if (choice==1){
            System.out.println(obj.withdraw());
        } else if (choice==2) {
            System.out.println(obj.balance);
        } else if (choice==3) {
            System.out.println(obj.deposit());
        } else if (choice==4) {
            System.out.println(obj.exit());
        }

    }
}
