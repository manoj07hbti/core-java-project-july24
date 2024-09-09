package conditional_statements;

public class BalanceCheck {



    public static void main(String[] args) {

        double balance=4000;

        if(balance>0){

         if(balance>10000){

             System.out.println("Please invest to FD");
         }

         if(balance>=5000 && balance<10000){

             System.out.println("Total balance is :" +balance);
         }

         if (balance<5000){

             System.out.println("Low balance "+balance);
         }


        }else {
            System.out.println("Balance is negative...");
        }


    }
}
