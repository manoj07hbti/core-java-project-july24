package Percentage_marks_age_group;

public class child_age {

    public static void main(String [] agrs){

        int age= 18;

        if(age>=0 && age<18){

            System.out.println("this age child age.....");

        } else{

            System.out.println("this is not child age..");
        }

        // 02 true && false = false

        age= 17;

        if(age>=0 && age<18){

            System.out.println("this age child age.");

        } else{

            System.out.println("this is not child age...");
        }

        // que 03 false && true =false

        age= 02;

        if(age>=0 && age<18){

            System.out.println("this age child age..");

        } else{

            System.out.println("this is not child age...");
        }

        // que 04 fale && false = false

        age= 10;

        if(age>=0 && age<18){
            System.out.println("this age child age..");

        } else{

            System.out.println("this is not child age...");
        }

        // que 01 TRUE || TRUE = TRUE

         age= 18;

        if(age>=0 || age<18){

            System.out.println("this age child age.....");

        } else{

            System.out.println("this is not child age..");
        }

        // que 02  TRUE || false = TRUE

        age= 17;

        if(age>=0 || age<18){

            System.out.println("this age child age.");

        } else{

            System.out.println("this is not child age...");
        }

        // que 03 false || true = TRUE


        age= 02;

        if(age>=0 || age<18){

            System.out.println("this age child age..");

        } else{

            System.out.println("this is not child age...");
        }

        // que 04 fale || false = false

        age= 10;

        if(age>=0 || age<18){
            System.out.println("this age child age..");

        } else{

            System.out.println("this is not child age...");
        }





    }
}
