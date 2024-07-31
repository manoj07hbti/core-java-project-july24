package conditional_statements;

public class NestedIf {

    public static void main(String[] args) {

        int number=-17;
        if(number>0){

            if(number%2 == 0){
                System.out.println("Even Number..."+number);
            }else {
                System.out.println("ODD Number ... " +number);
            }

        } else {
            System.out.println("Please provide a non negative number");
        }

    }
}
