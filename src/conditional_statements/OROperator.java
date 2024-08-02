package conditional_statements;

public class OROperator {

    public static void main(String[] args) {

        String brandName="LENOVO";
        int ram=8;
//1.   TRUE  || TRUE = TRUE

        if(ram>=8 || brandName== "LENOVO"){
            System.out.println("Good Configuration laptop...");
        }else {
            System.out.println("Not Good Configuration laptop...");
        }
//2.   TRUE  || FALSE= TRUE
        brandName="MicroMax";

        if(ram>=8 || brandName== "LENOVO"){
            System.out.println("Good Configuration laptop...");
        }else {
            System.out.println("Not Good Configuration laptop...");
        }

//3.   FALSE || TRUE=  TRUE
        ram=6;
        brandName="LENOVO";

        if(ram>=8 || brandName== "LENOVO"){
            System.out.println("Good Configuration laptop...");
        }else {
            System.out.println("Not Good Configuration laptop...");
        }

//4.   FALSE || FALSE= FALSE
        brandName="MicroMax";
        if(ram>=8 || brandName== "LENOVO"){
            System.out.println("Good Configuration laptop...");
        }else {
            System.out.println("Not Good Configuration laptop...");
        }
    }
}
