package oops.inheritance;

public class GooglePay extends PaymentSystem{

    public static void main(String[] args) {

        GooglePay obj = new GooglePay();

        obj.paymentFacilities();
        obj.EasyTranscation();
        obj.contactlessPayment();
        obj.encryptedTranscation();
        obj.directTranscation();
    }
}
