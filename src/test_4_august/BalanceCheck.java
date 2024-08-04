package test_4_august;

public class BalanceCheck {

    public static void main(String[] args) {

        double balance = 9500;

        if(balance > 0 ){

            if(balance <5000){
                System.out.println("Low Balance");
            }
            else if(balance > 5000 && balance < 10000){
                System.out.println("Total Balance is: " +balance);
            } else if (balance >= 10000) {
                System.out.println("Please Invest in FD");
            }

        } else{
            System.out.println("Insufficient or Zero Balance");
        }

    }

}
