package exception;

import java.util.Scanner;

public class BankAccount {

    public void openAccount(int money) throws LessAmount {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the balance which you want to open bank account");

        int amount = scanner.nextInt();

        if (amount >= 5000) {
            System.out.println("Welcome now you can open your bank account");
        } else {

            throw new LessAmount("Person is not eligible to open bank account");
        }

    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();

        try {
            obj.openAccount(4000);
        } catch (LessAmount e) {
            System.out.println("Exception occurred " + e);
        }
    }


}
