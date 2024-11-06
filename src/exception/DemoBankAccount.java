package exception;

import java.util.Scanner;

public class DemoBankAccount {

    public void openAccount() throws LessAmountException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Min Balance with which you want to open your account");
        double amount= sc.nextDouble();

        if(amount >= 5000){
            System.out.println("Congrats!!. You can open your account.");
        } else{
            throw new LessAmountException("Amount should be greater or equal to 5000 to Open bank Account....");
        }

    }

    public static void main(String[] args){

        DemoBankAccount obj = new DemoBankAccount();
        try {
            obj.openAccount();
        } catch (LessAmountException e) {
            System.out.println("Exception occurred: "+e);
        }

    }
}
