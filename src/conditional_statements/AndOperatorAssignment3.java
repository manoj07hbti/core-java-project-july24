package conditional_statements;

public class AndOperatorAssignment3 {

    public static void main(String[] args) {

        // 3 percentage>75 Gold medalist

        // percentage>75 and percentage<90

        // 1 case TRUE && TRUE = TRUE   (AND OPERATOR)
        // 1 case TRUE || TRUE = TRUE   (OR OPERATOR)

        int number=80;
        if(number>75 && number<90){
            System.out.println("GOLD MEDALIST...");
        } else{
            System.out.println("FIRST DIVISION..");
        }

        if(number>75 || number<90){
            System.out.println("GOLD MEDALIST..");
        }else{
            System.out.println("FIRST DIVISION...");
        }

        // 2 case TRUE && FALSE = FALSE
        // 2 case TRUE || FALSE = TRUE

        number=100;
        if(number>75 && number<90){
            System.out.println("GOLD MEDALIST....");
        } else{
            System.out.println("FIRST DIVISION...");
        }

        if(number>75 || number<90){
            System.out.println("GOLD MEDALIST");
        } else{
            System.out.println("FIRST DIVISION");
        }

        // 3 case FALSE && TRUE = FALSE   (AND OPERATOR)
        // 3 case FALSE || TRUE = TRUE    (OR OPERATOR)

        number=70;
        if(number>75 && number<90){
            System.out.println("GOLD MEDALIST...");
        } else{
            System.out.println("First dvision...");
        }

        if(number>75 || number<90){
            System.out.println("GOLD MEDALIST..");
        } else{
            System.out.println("FIRST DIVISION...");
        }



        // 4 case FALSE && FALSE = FALSE  ( AND OOPERATOR)
        // 4 case FALSE || FALSE = FALSE  (OR OPERATOR)

        number=70;
        number=100;
        if(number>75 && number<90){
            System.out.println("GOLD MEDALIST...");
        } else{
            System.out.println("FIRST DIVISION...");
        }

        if(number>70 || number<90){
            System.out.println("GOLD MEDALIST...");
        } else{
            System.out.println("FIRST DIVISION");
        }






    }




}
