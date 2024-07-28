package conditional_statements;

public class Assignment1 {

    public static void main(String[] args) {

        //1- check voting eligibility
        int age=17;

        if(age>18){
            System.out.println("Welcome to Voting System");
        } else{
            System.out.println("You're not eligible for Voting as your age is less than 18 years.");
        }

        //2- marks
        int marks=45;

        if(marks>33){
            System.out.println("Clear the Exam");
        }else{
            System.out.println("Not Cleared the Exam");
        }

        //3-Nationality check
        String country= "INDIA";

        if(country == "INDIA"){
            System.out.println("INDIAN");
        }else{
            System.out.println("Not INDIAN");
        }

        //4- Science
        String dept="COMMERCE";

        if(dept == "SCIENCE"){
            System.out.println("SCIENCE DEPARTMENT STUDENT");
        }else{
            System.out.println("NOT SCIENCE DEPARTMENT STUDENT");
        }

        //5- Height Check
        double height= 5.11;

        if(height>6){
            System.out.println("Candidate is Tall");
        }else{
            System.out.println("Candidate is not Tall");
        }






        }

    }


