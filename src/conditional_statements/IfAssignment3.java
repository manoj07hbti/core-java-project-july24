package conditional_statements;

public class IfAssignment3 {


    public static void main(String[] args) {

        String Country = "INDIA";

        if(  Country == "INDIA") {
            System.out.println("Candidate is INDIAN:" + Country);
        }


        if(Country!="INDIA") {
            System.out.println("Candidate is NON INDIAN:" + Country);
        }
        Country = "AMERICA";

        if(Country == "INDIA") {
            System.out.println("Candidate is INDIAN:" + Country);
        }
        if(Country!="INDIA") {
            System.out.println("Candidate is NON INDIAN:" + Country);
        }
    }
}


