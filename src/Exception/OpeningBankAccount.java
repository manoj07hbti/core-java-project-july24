package Exception;

public class OpeningBankAccount {

    public String accountopen(int amount) throws LessAmountException {

        if (amount >= 5000) {

            return "SBI BANK..";

        } else {

            throw new LessAmountException("ACCOUNT OPEN IS 5000");

        }
    }

    public static void main(String[] args) {
        OpeningBankAccount obj = new OpeningBankAccount();
        try {
            obj.accountopen(2000);

        } catch (LessAmountException e) {

            System.out.println("Exception Occurred...." + e);

        }
    }


}
