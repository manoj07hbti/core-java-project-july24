package Percentage_marks_age_group;

public class Percentage_marks_33_60 {

    public static void main(String[] args) {


        int number= 53;

        // que 01 TRUE && TRUE = TRUE

        if(number>=33 && number<60){
            System.out.println("Student clear exam second div");

        } else{

            System.out.println("Student is not clear exam second div");
        }
        // que 02  true && false = false

            number = 55;

        if (number >= 33 && number == 60) {

            System.out.println("Student clear exam second div.....");
        } else {

            System.out.println("Student is not clear exam second div.....");
        }

        // que 03 false && true =false

        number = 20;

        if (number >= 33 && number == 60){

            System.out.println("Student clear exam second div.....");

        } else {

            System.out.println("Student is not clear exam second div.....");
        }

        // que 04 fale && false = false

        number = 40;

        if (number >= 33 && number== 60){

            System.out.println("Student clear exam second div.....");

        } else {

            System.out.println("Student is not clear exam second div.....");
        }

        // que 01 TRUE || TRUE = TRUE

        if(number>=33 || number<60){

            System.out.println("Student clear exam second div");

        } else {

            System.out.println("Student is not clear exam second div");

        }

        // que 02  TRUE || false = TRUE

        number = 55;

        if (number >= 33 || number == 60) {

            System.out.println("Student clear exam second div.....");
        } else {

            System.out.println("Student is not clear exam second div.....");
        }


        // que 03 false || true = TRUE

        number = 28;

        if (number >= 33 || number == 60){

            System.out.println("Student clear exam second div.....");

        } else {

            System.out.println(" Student is not clear exam second div.....");
        }

        // que 04 fale || false = false

        number = 40;

        if (number >= 33 || number== 60){

            System.out.println("Student clear exam second div.....");

        } else {

            System.out.println(" Student is not clear exam second div.....");
        }












    }
}
