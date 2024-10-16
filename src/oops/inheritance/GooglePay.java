package oops.inheritance;

public class GooglePay extends  PaymentGateway {
    public static void main(String[] args) {
        GooglePay obj = new GooglePay();

        obj.paymentMethod();
    }
}
