package Percentage_marks_age_group;

public class percentage_marks_60_75 {

    public static void main(String [] agrs){

        // 01 true && true = true

        int number= 73;

        if(number>=60 && number<75){

            System.out.println("Student passed first division..");

        } else{

            System.out.println("Student is not passed first division...");
        }

         // 02 true && false = false

         number= 68;

        if(number>=60 && number<75){
            System.out.println("Student passed first division..");
        } else{
            System.out.println("studend is not pass first div...");
        }

        // que 03 false && true =false

        number = 59;

        if (number >= 60 && number == 75){

            System.out.println("Student passed first division.....");

        } else {

            System.out.println("studend is not pass first div .....");
        }

        // que 04 fale && false = false

        number = 50;

        if (number >= 60 && number== 75){

            System.out.println("studend pass first div.....");

        } else {

            System.out.println(" studend is not pass first div.....");
        }

        // que 01 TRUE || TRUE = TRUE

        if(number>=60|| number<75){

            System.out.println("studend passed first div");

        } else {

            System.out.println("studend is not pass first div");

        }


        // que 02  TRUE || false = TRUE

        number = 72;

        if (number >= 60 || number == 75) {

            System.out.println(" studend pass first div.....");
        } else {

            System.out.println(" studend is not pass first div.....");
        }

        // que 03 false || true = TRUE

        number = 40;

        if (number >= 60 || number == 75){

            System.out.println("studend pass first div.....");

        } else {

            System.out.println(" studend is not pass first div.....");
        }

        // que 04 fale || false = false

        number = 70;

        if (number >= 60 || number== 75){

            System.out.println("studend pass first div.....");

        } else {

            System.out.println(" studend is not pass first div.....");
        }












    }
}
