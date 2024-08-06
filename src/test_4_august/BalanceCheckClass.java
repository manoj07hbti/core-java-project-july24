package test_4_august;

public class BalanceCheckClass {

    public static void main(String[] args) {

        //case1:balance >10000
        //case2:5000<balance<10000
        //case3:0<balance<5000

        int balance =7000;

        if (balance > 0) {
            if (balance > 10000) {
                System.out.println("please invest to FD");
            } else if (balance > 5000 && balance < 10000) {
                System.out.println("total balance is:" + balance);
            } else if (balance < 5000) {
                System.out.println("low balance:" + balance);
            }
        }else {
                System.out.println("please enter valid amount");
        }
    }
}