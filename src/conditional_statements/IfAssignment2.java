package conditional_statements;

public class IfAssignment2 {

    public static void main(String[] args) {


        int marks = 56;

        if(marks > 33) {
            System.out.println("CLEARED THE EXAM:"+marks);
        }
        if(marks < 33){
            System.out.println("NOT CLEARED THE EXAM:"+marks);
        }

        marks = 28;

        if(marks > 33) {
            System.out.println("CLEARED THE EXAM:"+ marks);
        }
        if(marks < 33){
            System.out.println("NOT CLEARED THE EXAM:"+ marks);
        }

    }
}

