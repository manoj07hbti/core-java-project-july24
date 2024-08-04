package test_4_august;

public class Balance_check {

    public static void main(String[] args) {

        //qes 01

            int balance= 200000;

            if(balance>0){

                System.out.println("Balance...");
            }

            // 02

            if(balance>0){

                if(balance>10000){

                    System.out.println("FD");
                }
            }


            // 03

            balance= 8000;

            if(balance>5000 && balance<10000){

                System.out.println("bank bal is ..."+balance);

            } else{

                System.out.println("down bank BAL..."+balance);
            }

            // 04

            balance=4000;

            if(balance>0 && balance<5000){

                System.out.println("down BAL..."+balance);

            } else{
                System.out.println("BAL.."+balance);
            }













        }
}
