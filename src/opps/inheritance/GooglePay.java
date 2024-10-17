package opps.inheritance;

import java.util.Scanner;

public class GooglePay   extends  PaymentGateway {


    Scanner scanner = new Scanner(System.in);

    public void googlePay() {
        System.out.println("Printing google pay transaction providing QR code  , Air tickets , ");
    }
        public static void main (String[]args){

            GooglePay obj = new GooglePay();

            obj.googlePay();
        }


    }


