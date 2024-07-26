package conditional_statements;

public class DemoIf {

    public static void main(String[] args) {

        // SYNTAX : if(expression/condition){
        //                CODE
        //             }

       int age=17;

       if(age > 18 ){
           System.out.println("Person is eligible for DL " +age);
       }
        if(age < 18 ){
            System.out.println("Person is not eligible for DL " +age);
        }

       int run=99;

       if(run==100){
           System.out.println("Century completed..."+run);
       }
        if(run!=100){
            System.out.println("Century not completed..."+run);
        }

       double price=592.20;

       if(price >5000){
           System.out.println("Product is costly "+price);
       }
        if(price < 5000){
            System.out.println("Product is not costly "+price);
        }

        //String comparison
        String city="AGRA";

        if(city == "PUNE"){
            System.out.println("Candidate is from Pune..."+city);
        }
        if(city != "PUNE"){
            System.out.println("Candidate is from Pune..."+city);
        }

    }
}
