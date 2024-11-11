package exception;

public class AcountOpening {

    public String minBalance(int balance)throws NotEligible{
        if(balance>5000){
            return "Welcome to bank";
    }else {
            throw new NotEligible("Amount should be greater or equal to 5000 to open Account");
        }
}

    public static void main(String[] args) {
       AcountOpening obj =new AcountOpening();
        try {
            obj.minBalance(3000);
        } catch (NotEligible e) {
            System.out.println("Exception occurred..."+e);
        }
    }

}
