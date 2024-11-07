package exception;

public class AccountOpening {

    //SYNTAX:  throw new ExceptionName("msg")

    public String AccountOpening( double amount) throws LessAmount{

        if (amount>=5000){

            return "welcome to LessAmount..... ";


        }else {
            //we need to throw an exception

            throw new LessAmount("AMOUNT IS LESS THEN 5000 SO  LESS AccountOpening .... ");
        }
    }

    public static void main(String[] args) throws LessAmount {

        AccountOpening obj = new AccountOpening();

        try {

            obj.AccountOpening(3000);

        }
        catch (LessAmount e){
            System.out.println("Exception occurred ..." +e);

        }
    }
}
