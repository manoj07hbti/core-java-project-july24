package test_4_august;

public class TestJava {
    public static void main(String[] args) {

        //check student to check% of student

        //1. TRUE && TRUE = TRUE
        //Percentage>=33 &&< 60 second division

        int number = 50;
        if (number >= 33 && number <= 60) {
            System.out.println("person is pass second division");
        } else {
            System.out.println("person is not second division");

        }
        // percentage >=60 && <75 first division
        //TRUE && TRUE =TRUE

        number = 80;
        if (number >= 60 && number <= 75) {
            System.out.println("printing by person pass first division");
        } else {
            System.out.println("person is not pass to first division");
        }

        //3.  percentage > 75 gold madelist
        // TRUE && TRUE =TRUE
        number = 85;
        if (number > 75 ) {
            System.out.println("person is a gold madlist ");
        } else {
            System.out.println("person is not gold mad");
        }

    }
}




