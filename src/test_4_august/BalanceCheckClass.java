package test_4_august;

public class BalanceCheckClass {

    public static void main(String[] args) {

        //case1:balance >10000
        int balance = 120000;

        if (balance > 0) {
            if (balance > 10000) {
                System.out.println("please invest to FD");
            }
            if (balance > 5000 && balance < 10000) {
                System.out.println("total balance is:" + balance);
            }
            if (balance < 5000) {
                System.out.println("low balance:" + balance);
            }
        }




        //case2:5000<balance<10000

        balance = 7000;
        if (balance > 0) {
            if (balance > 10000) {
                System.out.println("please invest in FD");
            }
            if (balance > 5000 && balance < 10000) {
                System.out.println("total balance is :" + balance);
            }
            if (balance>0 && balance < 5000) {
                System.out.println("low balance:" + balance);
            }
        }
         //case3:0<balance<5000
        balance = 100;
        if (balance > 0) {
            if (balance > 10000) {
                System.out.println("please invest in FD");
            }
            if (balance > 5000 && balance < 10000) {
                System.out.println("total balance is :" + balance);
            }
            if (balance>0 && balance < 5000) {
                System.out.println("low balance:" + balance);
            }
        }
    }
}