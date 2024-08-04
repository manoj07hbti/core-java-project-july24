package test_4_august;

public class WithdrawMoneyClass {

    public static void main(String[] args) {
        int balance= 8000;
        if(balance>0 && balance<20000){
            if(balance%100==0){
                System.out.println("AMOUNT..."+balance);
            } else{
                System.out.println("NOT VALID...");
            }
        }

        balance= 594;
        if(balance>0 && balance<20000){
            if(balance%100==0){
                System.out.println("valid balance..."+balance);
            }else{
                System.out.println("invalid amount....."+balance);
            }

            // case 3  balance>10000

            balance= 15000;
            if(balance>0 && balance<10000){
                if(balance%100==0){
                    System.out.println("VAlid balance..."+balance);
                }else{
                    System.out.println("invalid balance..."+balance);
                }
            } else{
                System.out.println("WITHDRAW AMOUNT..."+balance);
            }
        }


    }






}
