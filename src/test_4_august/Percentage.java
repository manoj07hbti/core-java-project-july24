package test_4_august;

public class Percentage {

    public static void main(String[] args) {


    int number= 53;

    // que 01 TRUE && TRUE = TRUE

        if(number>=33 && number<60){
        System.out.println("Student clear exam second div");

    } else{

        System.out.println("Student is not clear exam second div");
    }
        // 01 true && true = true

         number= 73;

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





        // 01 true && true = true

         number= 90;

        if(number>=75 && number<90){

            System.out.println("Student is gold madelist.....");

        } else{

            System.out.println("Student is not gold madelist..");
        }

        // 02 true && false = false

        number= 75;

        if(number>=75 && number<90){
            System.out.println("Student is gold madelist..");

        } else{

            System.out.println("Student is not gold madelist...");
        }

        // que 03 false && true =false

        number= 70;

        if(number>=75 && number<90){
            System.out.println("Student is gold madelist..");

        } else{

            System.out.println("Student is not gold madelist...");
        }

        // que 04 fale && false = false

        number= 70;

        if(number>=75 && number<90){
            System.out.println("Student is gold madelist..");

        } else{

            System.out.println("Student is not gold madelist...");
        }




    }
}
