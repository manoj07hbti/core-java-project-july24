package oops.abstraction;

public class PayTM implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is check balance of PayTM");
    }

    @Override
    public void makePayment() {
        System.out.println("This is makePayment of PayTM");
    }

    @Override
    public void addMoneyToWallet() {
        System.out.println("This is addMoneyToWallet of PayTM");
    }

    public void investInFD(){

        System.out.println("This is investIFD of PayTM");

    }

}
