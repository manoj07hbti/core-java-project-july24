package conditional_statements;

public class NotOperator {

    public static void main(String[] args) {

        // write a code to check even number

        int number=6;

        if(number%2==0){
            System.out.println("Number is even number..."+number);
        }

        if( !(number%2 != 0)){
            System.out.println("Number is even Number using not operator..."+number);
        }



    }
}
