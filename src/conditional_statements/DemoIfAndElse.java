package conditional_statements;

public class DemoIfAndElse {

    public static void main(String[] args) {

        int age=15;

        if(age>18){
            System.out.println("Eligible for Voting...."+age);
        } else {
            System.out.println("Not eligible for Voting..."+age);
        }

        int run=100;

        if(run==100){
            System.out.println("century completed...");
        } else {
            System.out.println("Century not completed...");
        }

        double price=3543.234;
        if(price>5000){
            System.out.println("Costly product "+price);
        }else {
            System.out.println("Not Costly product...."+price);
        }


        String city="AGRA";
         if(city=="PUNE"){
             System.out.println("You are from Pune...");
         }else {
             System.out.println("You are not form Pune...");
         }

    }
}
