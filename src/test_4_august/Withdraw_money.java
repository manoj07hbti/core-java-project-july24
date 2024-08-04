package test_4_august;

public class Withdraw_money {

    public static void main(String[] args) {

        //01

        int money = 8000;

        if (money > 0 && money < 20000) {

            if (money % 100 == 0) {
                System.out.println("printing balance..." +money);

            } else {

                System.out.println("NO blance...");
            }
        }
              //02

             money = 765;

             if (money > 0 && money < 20000) {

             if (money % 100 == 0) {

                System.out.println("balance..." + money);

                } else {

                System.out.println("no blance....." + money);

                }

              //03

                 money = 15000;

                 if (money > 0 && money < 10000){

                 if (money % 100 == 0){

                    System.out.println("balance..." + money);

                } else {

                    System.out.println("no balance..." + money);
                }

                 } else {

                System.out.println("no balance..." + money);
            }
        }


    }

}
