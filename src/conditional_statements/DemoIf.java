package conditional_statements;

public class DemoIf {

    public static void main(String[] args) {

        // SYNTAX : if(condition/expression){
        //
        // }

        int age=21;

        if(age>18){
            System.out.println("Person is eligible for DL");
            System.out.println("Person is eligible for Dl : "+age);

        }
        int age1=17;
        if(age1<18){
            System.out.println("Person is not eigible for DL");
            System.out.println("Person is not eligible for Dl :"+age1);
        }

        int run=99;
        if(run==100){
            System.out.println("Person completed century");
            System.out.println("Person completed century : "+run);
        }

        double price=562.3;
        if(price>5000){
            System.out.println("Product is costly");
        }

        double price1=5621.3;
        if(price1<5000){
        System.out.println("Product is not costly");
        System.out.println("product is not costly : "+price1);
        }

        String city="AGRA";
        if(city=="PUNE"){
            System.out.println("Person is from pune");

        }

        String city1="AGRA";
        if(city1!="PUNE"){
            System.out.println("Person is not from pune");
            System.out.println("Person is not from pune : "+city1);

        }
         int run1=99;
        if(run1!=100){
            System.out.println("Player not scored century");
            System.out.println("Player not scored century : "+run1);

        }















    }















}
