package Percentage_marks_age_group;

public class old_age {

    public static void main(String [] agrs){

        int age= 65;

        if(age>=60 && age<80){

            System.out.println("this age old age.....");

        } else{

            System.out.println("this is not old age..");
        }

        // 02 true && false = false

        age= 75;

        if(age>=60 && age<80){

            System.out.println("this age old age.");

        } else{

            System.out.println("this is not old age...");
        }

        // que 03 false && true =false

        age= 59;

        if(age>=60 && age<80){

            System.out.println("this age old age..");

        } else{

            System.out.println("this is not old age...");
        }

        // que 04 fale && false = false

        age= 65;

        if(age>=60 && age<80){

            System.out.println("this age old age..");

        } else{

            System.out.println("this is not old age...");
        }

        // que 01 TRUE || TRUE = TRUE

        age= 60;

        if(age>=60 || age<90){

            System.out.println("this age old age.....");

        } else{

            System.out.println("this is not old age..");
        }

        // que 02  TRUE || false = TRUE

        age= 75;

        if(age>=60 || age<90){

            System.out.println("this age old age.");

        } else{

            System.out.println("this is not old age...");
        }

        // que 03 false || true = TRUE


        age= 58;

        if(age>=60 || age<90){

            System.out.println("this age old age..");

        } else{

            System.out.println("this is not old age...");
        }

        // que 04 fale || false = false

        age= 72;

        if(age>=60 || age<90){
            System.out.println("this age old age..");

        } else{

            System.out.println("this is not old age...");
        }




    }
}
