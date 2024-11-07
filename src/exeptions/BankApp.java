package exeptions;

public class BankApp {


    public String accountOpen(int money) throws LessAmountException {
        if (money >= 5000) {

            return "Welcome to HDFC Bank...";
        } else {

            // we need to throw Exception
            throw new LessAmountException("Amount is less than 5000 so account cannot open");
        }

    }

    public static void main(String[] args) {
        BankApp obj = new BankApp();
        try {
            obj.accountOpen(4000);
        } catch (LessAmountException e) {
            System.out.println("Exception Occurred.." + e);
        }

    }
}
