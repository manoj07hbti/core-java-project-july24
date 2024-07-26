package conditional_statements;

public class ConditionalAssignment3 {

    public static void main(String[] args) {

        String origin = "FINLAND";

        if(origin == "INDIA") {
            System.out.println("ORIGIN:" + origin);
        }


        if(origin!="INDIA") {
            System.out.println("ORIGIN:" + origin);
        }
        origin = "INDIA";

        if(origin == "INDIA") {
            System.out.println("ORIGIN:" + origin);
        }
        if(origin!="INDIA") {
            System.out.println("ORIGIN:" + origin);
        }
    }
}
