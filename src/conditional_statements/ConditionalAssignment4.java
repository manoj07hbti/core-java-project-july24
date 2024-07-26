package conditional_statements;

public class ConditionalAssignment4 {

    public static void main(String[] args) {

        String dept = "SCIENCE";

        if(dept == "SCIENCE") {
            System.out.println("FROM SCIENCE DEPARTMENT");
        }
        if(dept != "SCIENCE"){
            System.out.println("NOT FROM SCIENCE DEPARTMENT:"+dept);
        }

         dept = "HINDI";

        if(dept == "SCIENCE") {
            System.out.println("FROM SCIENCE DEPARTMENT:"+ dept);
        }
        if(dept != "SCIENCE"){
            System.out.println("NOT FROM SCIENCE DEPARTMENT:"+ dept);
        }
    }
}
