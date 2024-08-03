package conditional_statements;

public class AndOperatorAssignment1 {

    public static void main(String[] args) {

        // write a code to check % of student
        // 1 percentage >=33 and <60 (Second division)

        int number= 50;
        // 1 case TRUE && TRUE = TRUE  ( AND OPERATOR)
        // 1 case TRUE || TRUE = TRUE ( OR OPERATOR)

        if(number>=33 && number<60){
            System.out.println("Student passed out by second division");
        } else{
            System.out.println("STudent failed in exam");
        }

        if(number>=33 || number<60){
            System.out.println("SECOND DIVISION");
        } else{
            System.out.println("FAILED");
        }
         // 2 case TRUE && FALSE = FALSE  ( AND OPERATOR)
        // 2 case TRUE || FALSE =TRUE     ( OR OPERATOR)

        number=65;
        if(number>=33 && number<60){
            System.out.println("Passed out by second division...");
        } else{
            System.out.println("Failed in exam...");
        }

        if(number>=33 || number<60){
            System.out.println("Second division");
        }else{
            System.out.println("FAiled");
        }

        // 3 case FALSE && TRUE = FALSE   ( AND OPERATOR)
        // 3 case FALSE || TRUE = TRUE    (OR OPERATOR)

        number=30;
        if(number>=33 && number<60){
            System.out.println("passed out by second division...");
        } else{
            System.out.println("Failed in exam...");
        }

        if(number>=33 || number<60){
            System.out.println("SECOND DIVISION");
        } else{
            System.out.println("FAiled...");
        }
         // 4 case FALSE && FALSE = FALSE  ( AND OPERATOR )
        // 4 case FALSE || FALSE = FALSE   ( OR OPERATOR)

        number=30;
        number=65;
        if(number>=33 && number<60){
            System.out.println("Passed out by second division...");
        } else{
            System.out.println("Failed in exam....");
        }

        if(number>=33 || number<60){
            System.out.println("Second");
        } else{
            System.out.println("Failed");
        }







    }








}
