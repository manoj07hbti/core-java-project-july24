package test_4_august;

public class BalanceCheckClass {

    public static void main(String[] args) {

        // we need to check user balnce it should be greater than zero

        int balance= 200000;
        // 1 number>0

        if(balance>0){
            System.out.println("Balance...");
        }

        // 2 balance>10000

        if(balance>0){
            if(balance>10000){
                System.out.println("PLEASE INVEST IN FD");
            }
        }


        // 3 balance>5000 and < 10000

        balance= 8000;
        if(balance>5000 && balance<10000){
            System.out.println("Total balance is ..."+balance);
        } else{
            System.out.println("LOW BALANCE..."+balance);
        }

        // 4 balance>0 and <5000

        balance=4000;
        if(balance>0 && balance<5000){
            System.out.println("LOW BALANCE..."+balance);
        } else{
            System.out.println("BALANCE.."+balance);
        }



    }





}
