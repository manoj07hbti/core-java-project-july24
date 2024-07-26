package conditional_statements;

public class ConditionalAssigment2 {

    public static void main(String[] args) {

        int marks = 26;

        if(marks > 33) {
            System.out.println("CLEARED THE EXAM:"+marks);
        }
        if(marks < 33){
            System.out.println("NOT CLEARED THE EXAM:"+marks);
        }

        marks = 90;

        if(marks > 33) {
            System.out.println("CLEARED THE EXAM:"+ marks);
        }
        if(marks < 33){
            System.out.println("NOT CLEARED THE EXAM:"+ marks);
        }

    }
}
