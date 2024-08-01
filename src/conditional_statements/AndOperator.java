package conditional_statements;

public class AndOperator {

    public static void main(String[] args)

    {

        //Class which tell which student got 60% marks in science stream with all 4 scenarios

        int Marks = 60;
        String Stream = "Science";

        // True & True (Scenario-1 with Student X)

        if (Marks >= 60 && Stream == "Science") {
            System.out.println("Student X got 60+ marks in Science Stream and passed the exam");
        } else{
            System.out.println("Student X was not able to pass the exam in Science Stream");
        }

        // True & False (Scenario-2 with Student Y)

        Stream = "Commerce";
        if (Marks >= 60 && Stream == "Science") {
            System.out.println("Student X got 60+ marks in Science Stream and passed the exam");
        } else{
            System.out.println("Student Y do not belongs to Science Stream");
        }

        //False & True (Scenario-3 with Student X)

        Marks = 45;
        if (Marks >= 60 && Stream == "Science") {
            System.out.println("Student X got 60+ marks in Science Stream and passed the exam");
        } else{
            System.out.println("Student X got less than 60 marks and failed the exam in Science Stream");
        }

        // False & False (Scenario-4 with Student Y)

        Marks = 45;
        Stream = "Commerce";
        if (Marks >= 60 && Stream == "Science") {
            System.out.println("Student X got 60+ marks in Science Stream and passed the exam");
        } else{
            System.out.println("Student Y do not belongs to Science Stream and failed the exam in Commerce Stream");
        }

        //Class which tell who is able and eligible to vote in Uttar Pradesh

        int Age =18;
        String State ="Uttar Pradesh";

        // True & True (Scenario-1 with Person ABC)

        if (Age >= 18 && State == "Uttar Pradesh")
        {
            System.out.println("Person ABC belongs to Uttar Pradesh and eligible to vote in Uttar Pradesh");
        } else{
            System.out.println("Person XYZ do not belongs to Uttar Pradesh and not eligible to vote in Uttar Pradesh");
        }

        //True & False (Scenario-2 with Person XYZ)

        State ="Maharashtra";
        if (Age >= 18 && State == "Uttar Pradesh")
        {
            System.out.println("Person ABC belongs to Uttar Pradesh and eligible to vote in Uttar Pradesh");
        } else{
            System.out.println("Person XYZ do not belongs to Uttar Pradesh");
        }

        // False & True (Scenario-3 with Person ABC)

        Age =16;
        if (Age >= 18 && State == "Uttar Pradesh")
        {
            System.out.println("Person ABC belongs to Uttar Pradesh and eligible to vote in Uttar Pradesh");
        } else{
            System.out.println("Person ABC is a minor and not eligible to vote in Uttar Pradesh");
        }

        // False & False (Scenario-4 with Person XYZ)

        Age = 16;
        State ="Maharashtra";
        if (Age >= 18 && State == "Uttar Pradesh")
        {
            System.out.println("Person ABC belongs to Uttar Pradesh and eligible to vote in Uttar Pradesh");
        } else{
            System.out.println("Person XYZ do not belongs to Uttar Pradesh and not eligible to vote");
        }

    }
}
