package Percentage_marks_age_group;

public class Percentage_75_90 {

    public static void main(String [] agrs ){


        // 01 true && true = true

        int number= 90;

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

        // que 01 TRUE || TRUE = TRUE

         number= 90;

        if(number>=75 || number<90){

            System.out.println("Student is gold madelist.....");

        } else{

            System.out.println("Student is not gold madelist..");
        }

        // que 02  TRUE || false = TRUE

        number= 86;

        if(number>=75 || number<90){

            System.out.println("Student is gold madelist.....");

        } else{

            System.out.println("Student is not gold madelist..");
        }

        // que 03 false || true = TRUE

        number= 74;

        if(number>=75 || number<90){

            System.out.println("Student is gold madelist.....");

        } else{

            System.out.println("Student is not gold madelist..");
        }

        // que 04 fale || false = false

        number= 74;

        if(number>=75 || number<90){

            System.out.println("Student is gold madelist.....");

        } else{

            System.out.println("Student is not gold madelist..");
        }












    }
}
