package test_4_august;

public class Balancecheckclass {


    public static void main(String[] args) {


        //-1  balance >10000
        int balance = 120000;

        if (balance > 0) {
            if (balance > 10000) {
                System.out.println(" invest to FD");
            }
            if (balance > 5000 && balance < 10000) {
                System.out.println("total bank balance is:" + balance);
            }
            if (balance < 5000) {
                System.out.println("bank balance is low" + balance);
            }
        }

        // -2 balance<10000 and >5000

        balance = 6000;
        if (balance > 0) {
            if (balance > 10000) {
                System.out.println("please invest in FD");
            }
            if (balance > 5000 && balance < 10000) {
                System.out.println("total balance is :" + balance);
            }
            if (balance > 0 && balance < 5000) {
                System.out.println("low balance:" + balance);
            }
        }

         // 3- balance<5000and>0

        balance = 2000;
        if (balance > 0) {
            if (balance > 10000) {
                System.out.println("please invest in FD");
            }
            if (balance > 5000 && balance < 10000) {
                System.out.println("total balance is :" + balance);
            }
            if (balance > 0 && balance < 5000) {
                System.out.println("low balance:" + balance);
            }
        }
    }

    }