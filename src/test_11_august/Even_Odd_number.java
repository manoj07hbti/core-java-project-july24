package test_11_august;

public class Even_Odd_number {

    public static void main(String[] args) {

         // ques 01


           // print even numbers 3 to 300

        int number = 300;

        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "");
            }
        }

        // print odd numbers 3 to 300

        number=300;
        for(int k=1; k<=300; k++) {
            if (k % 3 != 0) {
                System.out.println(k + "");
            }
        }

        //ques02


        String city ="pune";
        int voting = +18;

        System.out.println("this person is voting "+ city);

        // ques 03

        //SYNTAX; dobule result=(dobule) (number*percentage)/100

        number = 500;
        long  percentage =5;

        double result = (double)(number*percentage)/100;

        System.out.println("printing percentage  :"+result);


        //  ques 04


        // printing even number 01 to 100


         number = 100;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
        }

        //ques 5    the number to factorial
        int a, x=1;

         number=4;

        for(a=1; a<=4; a++){

            x = x * a;
        }
        System.out.println("value of "+number+" is: "+x);




        //loops

        // ques 01

        // INCREMENT FOR LOOP

        for ( int i=1;  i<=5 ; i++ ){

            System.out.println(" " +i);
        }

            // SYNTAX:   for (start_condition; conditional_expression; decrement){
                   //                 //CODE
                              //              }

        for(int i=5; i>0 ; i--){

            System.out.println(" "+i);
        }

       //ques 02

        // prime number 01 to 20

        for(int i=1; i<=20; i++) {

            for (int k = 2; k <= 1; k++) {

                if (i % k == 0) ;

                System.out.println("i + k");

            }
        }

        //ques 03

       // type a code star parten

        // CODE START PATTERN

        for(int i=1; i<=5; i++) {

            System.out.println("i = "+i);
        }
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        // ques 04

        // CODE START PATTERN

        for(int i=1; i<=5; i++) {

            System.out.println("i = "+i);
        }
        System.out.println("*");
        System.out.println("**");
        System.out.println("*");
        System.out.println("**");
        System.out.println("*");








    }
}
