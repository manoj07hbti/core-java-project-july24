package conditional_statements;

public class Marks_demo {

    public static void main(String args []) {


        // SYNTAX : if(expression/condition){
        //           CODE   }


        int marks = 33;

        if (marks > 45) {
            System.out.println("Person is eligible for exam " + marks);
        }

        if (marks < 32) {
            System.out.println("Person is not eligible for not exam " + marks);

        }
    }
}
