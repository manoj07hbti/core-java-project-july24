package oops.abstraction.interfac;

public class PhonePe implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is check balance feature of PhonePe");

    }

    @Override
    public void makepayment() {
        System.out.println("This is make payment feature of PhonePe");

    }

    @Override
    public void addMoneyToWallet() {
        System.out.println("This is add Money To Wallet feature of PhonePe");
    }

    public void insurance(){
        System.out.println("This is insurance feature of PhonePe");
    }
}
