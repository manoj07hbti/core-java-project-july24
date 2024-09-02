package methods;

public class Division_Student {




    public void makeDivision(){

        double sub1marks = 80;
        double sub2marks = 75;
        double sub3marks = 60;
        double sub4marks = 82;
        double sub5marks = 90;
        double sub6marks = 90;
        double marksobtained = 477;
        double percentage = ((double) 477 / 600) * 100;
        System.out.println("Printing markss...." + percentage);

        if (percentage >= 60 && percentage <= 70) {
            System.out.println("Printing third division...");

        } else if (percentage >= 70 && percentage <= 75) {
            System.out.println("Printing second division");

        } else if (percentage >= 80 && percentage <= 95) {
            System.out.println("printing first division");

        } else {
            System.out.println("Failed in exam");
        }

    }

    public static void main(String[] args) {
        Division_Student obj= new Division_Student();

        obj.makeDivision();


    }



}
