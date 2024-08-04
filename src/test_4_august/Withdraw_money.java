package test_4_august;

public class Withdraw_money {


    public static void main(String[] args) {


        // money withdraw
         // multiple balance 100

        int balance=9000;

        if(balance>0 && balance<10000){
            if(balance%100==0){
                System.out.println("valid amount:"+balance);
            }else{
                System.out.println("invalid amount:"+balance);
            }
        }

          // money withdraw
        // Not multiple 100

         balance=345;

        if(balance>0 && balance<10000){
            if(balance%100==0){
                System.out.println("valid amount:"+balance);
            }else{
                System.out.println("invalid amount:"+balance);
            }
        }

      // money withdraw
        // balance is > 10000
         balance=15000;

        if(balance>0 && balance<10000) {
            if (balance % 100 == 0) {
                System.out.println("valid amount:" + balance);
            } else {
                System.out.println("invalid amount:" + balance);
            }
        }else{
            System.out.println("balance is greater than..."+balance);
        }
    }
























}
