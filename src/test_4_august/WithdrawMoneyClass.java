package test_4_august;

public class WithdrawMoneyClass {

    public static void main(String[] args) {

      //write a code for withdrwa money
        //case1)balance is multiple of 100
        int balance=5000;

        if(balance>0 && balance<10000){
            if(balance%100==0){
                System.out.println("valid amount:"+balance);
            }else{
                System.out.println("invalid amount:"+balance);
            }
        }
        //case2)not multiple of 100
        balance=675;

        if(balance>0 && balance<10000){
            if(balance%100==0){
                System.out.println("valid amount:"+balance);
            }else{
                System.out.println("invalid amount:"+balance);
            }
        }

        //case3)balance is greater than 10000
        balance=12000;

        if(balance>0 && balance<10000) {
            if (balance % 100 == 0) {
                System.out.println("valid amount:" + balance);
            } else {
                System.out.println("invalid amount:" + balance);
            }
        }else{
                System.out.println("balance is greater than 10000:"+balance);
        }
    }
}
