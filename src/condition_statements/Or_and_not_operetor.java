package condition_statements;

public class Or_and_not_operetor {


    public static void main(String[] args) {


        int percentage = 58;
        if (percentage >= 33 && percentage < 60) {
            System.out.println("SECOND DIVISION");
        } else {
            System.out.println("STUDENT IS FAILED");
        }


        percentage = 70;

        if (percentage >= 60 && percentage < 75) {
            System.out.println("STUDENT IS FIRST DIVISION");
        } else {
            System.out.println("STUDENT IS SECOND DIVISION");
        }


        percentage = 75;

        if (percentage >= 65 && percentage < 80) {
            System.out.println("STUDENT IS GOLD MEDELIST ");
        } else {
            System.out.println("STUDENT IS FIRST DIVISION");
        }

         // WRITE A CODE TO CHECK AGE GROUP
           //age>0 and age<40 : child
        // TRUE && TRUE = TRUE

        int age= 14;
        if(age>0 && age<18){
            System.out.println("he is child"+age);
        } else{
            System.out.println("he is not child"+age);
        }


        //age>18 and age<40 : young
        // TRUE && FALSE = TRUE

      age=39;

        if(age>18 && age<40){
            System.out.println("he is young"+age);
        } else{
            System.out.println("he is not young"+age);
        }


        //age>40 and age<60 : old

        age=59;
        if(age>40 && age<60){
            System.out.println("he is old age"+age);
        } else{
            System.out.println("he is not old age"+age);
        }




    }


    }
















