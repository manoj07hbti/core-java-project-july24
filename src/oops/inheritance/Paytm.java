package oops.inheritance;

public class Paytm extends PaymentSystem {

    public static void main(String[] args) {

        Paytm obj = new Paytm();
        obj.paymentFacilities();
        obj.EasyTranscation();
        obj.contactlessPayment();
        obj.encryptedTranscation();
        obj.directTranscation();
    }
}
