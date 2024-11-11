package oops.abstraction.interfac;

public class Gpay implements Payment {
    @Override
    public void checkBalance() {
        System.out.println("This is check balance feature of google pay");
    }

    @Override
    public void makepayment() {
        System.out.println("This is make payment feature of google pay");

    }

    @Override
    public void addMoneyToWallet() {
        System.out.println("This is add Money To Wallet feature of google pay");

    }
    public void fastTag(){
        System.out.println("This is fastTag feature of google pay");
    }
}
