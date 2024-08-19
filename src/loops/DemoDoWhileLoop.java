package loops;

public class DemoDoWhileLoop {

    public static void main(String[] args) {

        //SYNTAX:      do {
        //                   CODE
        //                  increment/decrement;
        //                } while(condition);

        int i=1;

        do{
            System.out.println("Hello World..."+i);
            i++;
        } while (i<=5);

       do{
           System.out.println("Decrement: Hello World..."+i);
           i--;
       } while (i>1);



    }
}
