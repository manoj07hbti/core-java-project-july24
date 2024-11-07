package exception;

public class AmountOpening {

    //Syntax: throw new Exception("MSG");

    public String balanceAmount(double balance ) throws LessAmountException{
        if(balance>=5000) {
            return "WELCOME TO HDFC BANK....";

        }else{
            throw new LessAmountException("YOUR BALANCE IS NOT SUFFICIENT OR LESS THAN 5000..");

        }
    }

    public static void main(String[] args) {
        AmountOpening obj = new AmountOpening();
        try{
            obj.balanceAmount(3000);
        } catch (LessAmountException e){
            System.out.println("exception occurred..... "+ e);
        }
    }
}
