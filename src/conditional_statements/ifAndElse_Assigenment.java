package conditional_statements;

public class ifAndElse_Assigenment {

    public static void main(String[] args) {


        int age=21;
        if(age>18){
            System.out.println("Eligible for voting.."+age);
        } else{
            System.out.println("Not eligible for voting..");
        }

        double price=4999;
        if(price>5000){
            System.out.println("product is costly...");
        } else{
            System.out.println("Product is not costly..."+price);
        }

        int marks=55;
        if(marks>=60){
            System.out.println("First Division..."+marks);

        } else{
            System.out.println("Second division..."+marks);
        }
         marks=32;
        if(marks>33){
            System.out.println("student passed the exam...");
        } else{
            System.out.println("Student not cleared the exam.."+marks);
        }

        String country="DUBAI";
        if(country=="INDIA"){
            System.out.println("INDIAN...");
        } else{
            System.out.println("NoN INDIAN..."+country);
        }

        age= 25;
        if(age>18){
            System.out.println("Eligible...");
        } else{
            System.out.println("Not eligble...");
        }



         }




    }




