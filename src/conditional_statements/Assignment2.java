package conditional_statements;

public class Assignment2 {

    public static void main(String[] args) {

        //1- marks
        int marks=55;

        if(marks>=60){
            System.out.println("First Division");
        } else{
            System.out.println("Not first Division");
        }

        if(marks<33){
            System.out.println("Not cleared exam");
        } else{
            System.out.println("Cleared Exam");
        }


        //2- price
        double price=492.40;

        if(price >5000){
            System.out.println("Costly Product: "+price);
        } else{
            System.out.println("Average Price Product: "+price);
        }

        //3- Nationality
        String country="INDIA";

        if(country == "INDIA"){
            System.out.println("You are Indian");
        }else{
            System.out.println("You are not Indian");
        }

        //4- divisibility check
        int num=27;

        if(num > 0){
            if(num%5 == 0){
                System.out.println(+num +" is divisible by 5");
            }else{
                System.out.println(+num +" is not divisible by 5");
            }
        } else{
            System.out.println( +num +" is a  negative number");
        }

        //5- voting
        int age= 17;

        if(age>=18){
            System.out.println("Welcome to Voting System");
        }else {
            System.out.println("You are not eligible for Voting as your age is less than 18 years");
        }
    }
}
