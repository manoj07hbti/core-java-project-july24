package conditional_statements;

public class AndOperatorAssignment5 {

    public static void main(String[] args) {

        // write a code to check age group

        // 1 age>0 and <18 : child

        // 1 case TRUE && TRUE = TRUE

        int number= 16;
        if(number>0 && number<18){
            System.out.println("Child...");
        } else{
            System.out.println("ADULT");
        }

        // age>=18 and <=40 : Young

        number= 25;
        // 1 case TRUE && TRUE = TRUE

        if(number>=18 && number<=40){
            System.out.println("YOUNG...");

        } else{
            System.out.println("ADULt...");

        }

        // 3 case age>=60 : old age

        number=65;

        if(number>=60){
            System.out.println("OLD AGE....");
        } else{
            System.out.println("YOUNG...");
        }

        number=50;

        if(number>=60){
            System.out.println("OLd age...");
        } else{
            System.out.println("Young");
        }



    }




}
