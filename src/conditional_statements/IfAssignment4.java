package conditional_statements;

public class IfAssignment4 {


        public static void main(String[] args) {

            String Department = "SCIENCE";

            if(Department == "SCIENCE") {
                System.out.println("Candidate is SCIENCE DEPARTMENT Student");
            }
            if(Department != "SCIENCE"){
                System.out.println("Candidate is NOT SCIENCE DEPARTMENT:"+Department);
            }

            Department = "ENGLISH";

            if(Department == "SCIENCE") {
                System.out.println("Candidate is SCIENCE DEPARTMENT Student:"+ Department);
            }
            if(Department != "SCIENCE"){
                System.out.println("Candidate is NOT SCIENCE DEPARTMENT Student:"+ Department);
            }
        }
    }


