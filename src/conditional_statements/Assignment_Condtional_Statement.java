package conditional_statements;

public class Assignment_Condtional_Statement {

    public static void main(String[] args) {

        int age=25;
        if(age>18){
            System.out.println("WELCOME TO VOTING SYSTEM");
            System.out.println("WELCOME TO VOTING SYSTEM : "+age);

        }
         age=17;
        if(age>18){
            System.out.println("Person is not eligible for voting ");
            System.out.println("Person is not eligible for voting : "+age);
        }

        int marks=50;
        if(marks>33){
            System.out.println("Candidate cleared the exam");
            System.out.println("Candidate cleared the exam : "+marks);
        }
        int marks1=32;
        if(marks1<33){
            System.out.println("Candidate is not cleared the exam");
            System.out.println("Candidate is not cleared the exam : "+marks1);
        }

        String person="INDIA";
        if(person=="INDIA"){
            System.out.println("Person belongs to INDIA");
            System.out.println("Person belongs to INDIA : "+person);
        }
        String candidate="DUBAI";
        if(candidate!="INDIA"){
            System.out.println("Candidate does not belong to INDIA ");
            System.out.println("Candidate is NON-INDIAN :"+candidate);
        }

        String student="SCIENCE";
        if(student=="SCIENCE"){
            System.out.println("Science department student");
            System.out.println("Science department student : "+student);
        }

        String student1="ARTS";
        if(student1!="SCIENCE"){
            System.out.println("Candidate is not from science department student");
            System.out.println("Candidate is not from science department :"+student1);
        }

        int height=7;
        if(height>6){
            System.out.println("Man is more than 6 feet");
            System.out.println("Man is more than 6 feet : "+height);
        }
         height=5;
        if(height<6);
        System.out.println("Man is not more than 6 feet");
        System.out.println("Man is not more than 6 feet : "+height);





    }



}
