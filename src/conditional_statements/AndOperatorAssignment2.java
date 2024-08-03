package conditional_statements;

public class AndOperatorAssignment2 {

    public static void main(String[] args) {

        // 2 percentage >= 60 and < 75  first division

        // 1 case TRUE && TRUE = TRUE  ( AND OPERATOR)
        // 1 case TRUE || TRUE = TRUE ( OR OPERATOR)

        int number= 70;
        if(number>=60 && number<75){
            System.out.println("Student passed out by first division..");
        } else{
            System.out.println("Second division...");
        }

        if(number>=60 || number<75){
            System.out.println("FIRST DIVISION...");
        } else{
            System.out.println("SECOND DIVISION");
        }

        // 2 case TRUE && FALSE = FALSE ( AND OPERATOR)
        // 2 case TRUE || FALSE = TRUE ( OR OPERATOR)

        number=80;
        if(number>=60 && number<75){
            System.out.println("First division...");
        } else{
            System.out.println("Second division..");
        }

        if(number>=60 || number<75){
            System.out.println("FIRST DIVISION..");
        } else{
            System.out.println("SECOND DIVISION...");
        }

        // 3 case FALSE && TRUE = FALSE  ( AND OPERATOR)
        // 3 case FALSE || TRUE = TRUE   ( OR OPERATOR)

        number=50;
        if(number>=60 && number<75){
            System.out.println("First division");
        } else{
            System.out.println("Second division...");
        }

        if(number>=60 || number<75){
            System.out.println("FIRST DIVISION");
        } else{
            System.out.println("SECOND DIVISION");
        }

        // 4 case FALSE && FALSE = FALSE   (AND OPERATOR)
        // 4 case FALSE || FALSE = FALSE   (OR OPERATOR)

        number=50;
        number=80;
        if(number>=60 && number<75){
            System.out.println("First division..");
        } else{
            System.out.println("Second division...");
        }

        if(number>=60 || number<75){
            System.out.println("FIRST DIVISION..");
        } else{
            System.out.println("SECOND DIVISION");
        }





    }





}
