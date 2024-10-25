package oops.abstraction;

public class PhonePe implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is check balance of PhonePe");
    }

    @Override
    public void makePayment() {
        System.out.println("This is makePayment of PhonePe");
    }

    @Override
    public void addMoneyToWallet() {
        System.out.println("This is addMoneyToWallet of PhonePe");
    }

    public void buyInsurance(){
        System.out.println("This is buyInsurance of PhonePe");
    }
}
