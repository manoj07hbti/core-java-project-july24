package oops.abstraction.interfac;

public class Paytm implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is check balance of Paytm");

    }

    @Override
    public void makepayment() {
        System.out.println("This is make payment feature of Paytm");

    }

    @Override
    public void addMoneyToWallet() {
        System.out.println("This is add Money To Wallet feature of Paytm");

    }

    public void fixedDeposit(){
        System.out.println("This feature is for fixed deposit of Paytm");
    }
}
