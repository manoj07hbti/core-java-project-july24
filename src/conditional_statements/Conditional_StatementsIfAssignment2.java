package conditional_statements;

public class Conditional_StatementsIfAssignment2 {

    public static void main(String[] args) {

     ///  if assignment

        int age=25;
        if(age>18){
            System.out.println("Welcome to voting system...");
        }
        age=17;
        if(age<18){
            System.out.println("Person not eligible for voting");
        }
         int marks=70;
        if(marks>=60){
            System.out.println("Candidate cleared the exam and got first division..");
        }
        marks=32;
        if(marks<33){
            System.out.println("Candidate not cleared the exam..");
        }
         double price=6000;
        if(price>5000){
             System.out.println("Product is costly..");

        }
        price=4550;
        if(price<5000){
            System.out.println("Product is not costly");
        }
        String country="INDIA";
        if(country=="INDIA"){
            System.out.println("INDIAN...");
        }
        country="AUSTRALIA";
        if(country!="INDIA"){
            System.out.println("NON INDIAN..");
        }








    }











}
