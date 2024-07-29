package conditional_statements;

public class Assignment1 {

    public static void main(String[] args) {

        //1- marks
        int marks=70;

        if(marks>=60){
            System.out.println("First Division");
        }
        if(marks<33){
            System.out.println("Not cleared exam");
        }

        //2- price
        double price=492.40;

        if(price >5000){
            System.out.println("Costly Product: "+price);
        }
        if(price < 5000){
            System.out.println("Average Price Product: "+price);
        }

        //3- Nationality
        String country="INDIA";

        if(country == "INDIA"){
            System.out.println("You are Indian");
        }
        if(country != "INDIA"){
            System.out.println("You are not Indian");
        }

        }
    }


