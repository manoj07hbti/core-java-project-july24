package conditional_statements;

public class AndOperator {

    public static void main(String[] args) {
        // write a code to check whether a person is eligible for voting in AGRA
        // 1- age>=18 , 2- city==AGRA
        // operator &&  TRUE && TRUE = TRUE
        int age=18;
        String city="AGRA";
        //1. TRUE && TRUE = TRUE
        if (age>=18 && city=="AGRA"){
            System.out.println("Person is eligible for voting in AGRA...");
        }else {
            System.out.println("Person is NOT eligible for voting in AGRA...");
        }

        //2.   TRUE && FALSE= FALSE
        city="PUNE";
        if (age>=18 && city=="AGRA"){
            System.out.println("Person is eligible for voting in AGRA...");
        }else {
            System.out.println("Person is NOT eligible for voting in AGRA...");
        }
//3.   FALSE && TRUE= FALSE
        age=17;
        city="AGRA";
        if (age>=18 && city=="AGRA"){
            System.out.println("Person is eligible for voting in AGRA...");
        }else {
            System.out.println("Person is NOT eligible for voting in AGRA...");
        }
//4.   FALSE && FALSE= FALSE
       city="PUNE";
        if (age>=18 && city=="AGRA"){
            System.out.println("Person is eligible for voting in AGRA...");
        }else {
            System.out.println("Person is NOT eligible for voting in AGRA...");
        }

    }



}
