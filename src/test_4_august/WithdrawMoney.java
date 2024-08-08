package test_4_august;

public class WithdrawMoney {
    public static void main(String[] args) {

        double balance = 0;

        if(balance >0){   // if balance is > 0

            if(balance % 100 == 0){     // if balance is multiple of 100

                if(balance > 10000) {
                    System.out.println("User Cant withdraw the amount greater than 10000");
                } else {
                    System.out.println("You can Withdraw the amount");
                }

            }else {            // if balance is not multiple of 100
                System.out.println("Invalid Amount");
            }

        } else{       // if balance is zero
            System.out.println("Insufficient or Zero Balance");
        }

    }
}
