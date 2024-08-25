package conditional_statements;

public class IfAssignment1 {

    public static void main(String[] args) {


        int age = 27;

        if (age > 18) {
            System.out.println("WELCOME TO VOTING SYSTEM");
        }
        if (age < 18) {
            System.out.println("YOUR ARE NOT ELIGIBLE FOR VOTING :" + age);
        }

        age = 15;

        if (age > 18) {
            System.out.println("WELCOME TO VOTING SYSTEM");
        }
        if (age < 18) {
            System.out.println("YOUR ARE NOT ELIGIBLE FOR VOTING :" + age);
        }

    }
}



