package test_4_august;

public class PercentageCode {

    public static void main(String[] args) {

        // write a code to check % of student
        // 1 percentage>=33 and <60 : second division
        // 2 percentage >=60 and <75 : first division
        // 3 percentage>75: Gold medalist

        int percentage = 55;
        // 1 case TRUE && TRUE = TRUE

        if(percentage>=33 && percentage<60){
            System.out.println("SECOND DIVISION");
        } else{
            System.out.println("FAILED");
        }

        // 2 case TRUE && FALSE = FALSE

        percentage=65;
        if(percentage>=33 && percentage<60){
            System.out.println("SECOND DIVISION");
        } else{
            System.out.println("FAILED");
        }

        // 3 case FALSE && TRUE = FALSE

        percentage=32;
        if(percentage>=33 && percentage<60){
            System.out.println("SECODN DIVISION");
        } else{
            System.out.println("FAILED");
        }

        // 4 case FALSE && FALSE = FALSE

        percentage=32;
        percentage=65;
        if(percentage>=33 && percentage<60){
            System.out.println("SECOND DIVISION");
        } else{
            System.out.println("FAILED");
        }

        // 2 percentage>=60 and <75

        percentage=65;

        // 1 case TRUE && TRUE = TRUE

        if(percentage>=60 && percentage<75){
            System.out.println("FIRST DIVISION");
        } else{
            System.out.println("SECOND DIVISION");
        }

        // 2 case TRUE && FALSE = FALSE

        percentage= 80;

        if(percentage>=60 && percentage<75){
            System.out.println("FIRST DIVISION");
        } else{
            System.out.println("SECOND DIVISiON");
        }

        // 3 case FALSE && TRUE = FALSE

        percentage=55;
        if(percentage>=60 && percentage<75){
            System.out.println("FIRST DIVISION");
        } else{
            System.out.println("SECODN DIVISiOn");
        }

        // 4 case FALSE && FALSE = FALSE

        percentage=55;
        percentage=80;
        if(percentage>=60 && percentage<75){
            System.out.println("FIRST DIVISION");
        } else{
            System.out.println("FAILED");
        }

        // 3 percentage > 75 gold medalist
        percentage= 80;

        if(percentage>75){
            System.out.println("GOLD MEDALISt");
        } else{
            System.out.println("FIRST DIVISION");
        }





    }






}
