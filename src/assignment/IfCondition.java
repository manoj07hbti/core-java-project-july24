package assignment;

public class IfCondition {
    public static void main(String[] args) {
        //Eligibility for voting

        int age =15;
        if(age > 18){
            System.out.println("Welcome to voting system");
        }
        if(age < 18){
            System.out.println("You are not eligible for voting as your age is less than 18");
        }

        //Requirement of marks for clearance

        double marks=32;
        if(marks > 33){
            System.out.println("Cleared the exam");
        }
        if(marks < 33){
            System.out.println("Not cleared the exam");
        }

        // Check Nationality

        String country="Canada";
        if(country=="India"){
            System.out.println("INDIAN");
        }
        if(country != "India"){
            System.out.println("NON INDIAN");
        }

        //Checking Department
        String Department="Chemistry";
        if(Department=="Science"){
            System.out.println("Science Dept. student");

        }
        if(Department!="Science"){
            System.out.println("Not a science Dept. student");
        }
        //Checking height
        double height=5;
        if(height>6){
            System.out.println("TALL");
        }
        if(height<6){
            System.out.println("NOT TALL");
        }

    }

}
