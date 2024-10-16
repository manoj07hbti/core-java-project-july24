package oops.inheritance;

public class PhonePe extends PaymentSystem {


    public static void main(String[] args) {

        PhonePe obj = new PhonePe();
        obj.paymentFacilities();
        obj.EasyTranscation();
        obj.contactlessPayment();
        obj.encryptedTranscation();
        obj.directTranscation();
    }
}
