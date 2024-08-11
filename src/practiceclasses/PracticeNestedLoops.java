package practiceclasses;

import java.sql.SQLOutput;

public class PracticeNestedLoops {

    public static void main(String[] args) {

        // write a code to purchase a 5 pen packet and get 5 toffee free

        int pen=5;
        int toffee=5;

        for(int i=1; i<=5; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.println("FREE");
            }
            System.out.println();
        }

        // write a code a number divisible by 10 between 1 to 30

        int number=30;
        do{
            if(number%10==0)
            System.out.println("divide");
            number++;
        } while(number<30);

        // write a code a number is divisible by 4 between 1 to 30

        int i=4;
        while(i<=30){
            if(i%2==0 && i%4==0){
                System.out.println("Even numbers.."+i);
                i++;
            }

            // print table of 9

            int num=9;
            int result;
            for(int x=1; x<=10; x++){
                result=num*x;
                System.out.println("9" + "*" +x + "=" +(result));
            }

            // print table of 5;

             num=5;
            int r;
            for(int k=1; k<=10; k++){
                r=num*k;
                System.out.println("5" + "*" +k + "=" +(r));
            }

            // if else statement

            // write a program that a person have high fever

            int a=100;
            if(a>=90 ){
                System.out.println("HIGH FEVER..."+a);
            } else{
                System.out.println("Normal fever..."+a);
            }


        }



    }





}
