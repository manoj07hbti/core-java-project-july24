package test_4_august;

public class WithdrawMoneyClass {

    public static void main(String[] args) {

      //write a code for withdraw money
        //case1)balance is multiple of 100
        //case2)not multiple of 100
        //case3)balance is greater than 10000
        int balance=1200;

        if(balance>0 && balance<10000){
            if(balance%100==0){
                System.out.println("valid amount:"+balance);
            }else{
                System.out.println("invalid amount:"+balance);
            }
        }else{
            System.out.println("please enter valid number");
        }

    }
}
