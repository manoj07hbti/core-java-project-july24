package Percentage_marks_age_group;

public class Young_age {

    public static void main(String [] agrs){

        int age= 18;

        if(age>=18 && age<40){

            System.out.println("this age young age.....");

        } else{

            System.out.println("this is not young age..");
        }

        // 02 true && false = false

        age= 33;

        if(age>=18 && age<40){

            System.out.println("this age young age.");

        } else{

            System.out.println("this is not young age...");
        }

        // que 03 false && true =false

        age= 16;

        if(age>=18 && age<40){

            System.out.println("this age young age..");

        } else{

            System.out.println("this is not young age...");
        }

        // que 04 fale && false = false

        age= 25;

        if(age>=18 && age<40){

            System.out.println("this age young age..");

        } else{

            System.out.println("this is not young age...");
        }

        // que 01 TRUE || TRUE = TRUE

        age= 18;

        if(age>=18 || age<40){

            System.out.println("this age young age.....");

        } else{

            System.out.println("this is not young age..");
        }

        // que 02  TRUE || false = TRUE

        age= 32;

        if(age>=18 || age<40){

            System.out.println("this age young age.");

        } else{

            System.out.println("this is not young age...");
        }

        // que 03 false || true = TRUE


        age= 30;

        if(age>=18 || age<40){

            System.out.println("this age young age..");

        } else{

            System.out.println("this is not young age...");
        }

        // que 04 fale || false = false

        age= 26;

        if(age>=18 || age<40){
            System.out.println("this age young age..");

        } else{

            System.out.println("this is not young age...");
        }



    }
}
