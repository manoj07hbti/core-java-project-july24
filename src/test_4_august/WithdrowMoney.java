package test_4_august;

public class WithdrowMoney {

    public static void main(String[] args) {

        int balance=6000;
        if(balance>0 && balance<30000){
          if(balance%100==0){
            System.out.println("printing by amount.."+balance);
            }else{
              System.out.println("not valid amount.."+balance);
          }
        }

        //2. multiple balance 100
        balance = 400;
        if (balance >=0 && balance<=30000){
            if(balance%100==0){
            System.out.println("valid balance"+balance);
            }else{
                System.out.println("not valid balance"+balance);
            }
        }
        //  balance =10000
          balance =17000;
         if(balance>=0 && balance<=10000){
         if(balance%100==0){
             System.out.println("valid balance"+balance);
         }else{
             System.out.println("not valid"+balance);
         }
        }


            }
        }



