package assignment;

public class BalanceCheck {
    public static void main(String[] args) {
        int balance=5225;
        if(balance>0) {
            if (balance > 10000) {
                System.out.println("Please invest in FD");
            } else if (balance < 10000 && balance > 5000) {
                System.out.println("Total balance is: " + balance);

            } else if (balance < 5000 && balance > 0) {
                System.out.println("Low balance: " + balance);

            } else {
                System.out.println("Balance is negative");
            }
        }
    }
}
