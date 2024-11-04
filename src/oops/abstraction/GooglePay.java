package oops.abstraction;

public class GooglePay implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is check balance of Google pay");
    }

    @Override
    public void makePayment() {
        System.out.println("This is make payment of Google pay");
    }

    @Override
    public void addMoneyToWallet() {
        System.out.println("This is add money of Google pay");
    }

    public void fastTagRecharge(){
        System.out.println("This is fastTagRecharge of Google pay");
    }

}
