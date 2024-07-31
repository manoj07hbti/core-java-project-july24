package conditional_statements;

public class Assignment3 {

    public static void main(String[] args) {

            //1- MARKS

            //1. TRUE && TRUE = TRUE
            int marks=70;
            String stream= "SCIENCE";
            if(marks>=60 && stream == "SCIENCE"){
                System.out.println("Student got atleast 60% marks in Science Stream");
            }else{
                System.out.println("Student not got 60% marks or is not from Science Stream");
            }

            //2. TRUE && FALSE= FALSE
            stream= "MATHS";
            if(marks>=60 && stream == "SCIENCE"){
                System.out.println("Student got atleast 60% marks in Science Stream");
            }else{
                System.out.println("Student not got 60% marks or is not from Science Stream");
            }

            //3. FALSE && TRUE= FALSE
            marks=55;
            stream= "SCIENCE";
            if(marks>=60 && stream == "SCIENCE"){
                System.out.println("Student got atleast 60% marks in Science Stream");
            }else{
                System.out.println("Student not got 60% marks or is not from Science Stream");
            }

            //4. FALSE && FALSE= FALSE
            stream= "COMMERCE";
            if(marks>=60 && stream == "SCIENCE"){
                System.out.println("Student got atleast 60% marks in Science Stream");
            }else{
                System.out.println("Student not got 60% marks or is not from Science Stream \n");
            }

            //2- Voting

            //1. TRUE && TRUE = TRUE
            int age=18;
            String state="UP";
            if (age>=18 && state=="UP"){
                System.out.println("Person is eligible for voting in UP.");
            }else {
                System.out.println("Person is NOT eligible for voting in UP.");
            }

            //2. TRUE && FALSE= FALSE
            state= "MP";
            if (age>=18 && state=="UP"){
                System.out.println("Person is eligible for voting in UP.");
            }else {
                System.out.println("Person is NOT eligible for voting in UP.");
            }

            //3. FALSE && TRUE= FALSE
            age=17;
            state="UP";
            if (age>=18 && state=="UP"){
                System.out.println("Person is eligible for voting in UP.");
            }else {
                System.out.println("Person is NOT eligible for voting in UP.");
            }

            //4. FALSE && FALSE= FALSE
            state="HARYANA";
            if (age>=18 && state=="UP"){
                System.out.println("Person is eligible for voting in UP.");
            }else {
                System.out.println("Person is NOT eligible for voting in UP.");
            }



    }
}
