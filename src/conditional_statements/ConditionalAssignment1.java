package conditional_statements;

public class ConditionalAssignment1 {

    public static void main(String[] args) {

        //CODE TO CHECK VOTING ELIGIBILITY
        //SYNTAX :if(expression/condition){
        //         code
        //         }

        int age = 24;

        if (age > 18) {
            System.out.println("WELCOME TO VOTING SYSTEM");
        }
        if (age < 18) {
            System.out.println("YOUR ARE NOT ELIGIBLE FOR VOTING :" + age);
        }

        age = 17;

        if (age > 18) {
            System.out.println("WELCOME TO VOTING SYSTEM");
        }
        if (age < 18) {
            System.out.println("YOUR ARE NOT ELIGIBLE FOR VOTING :" + age);
        }

    }
}
