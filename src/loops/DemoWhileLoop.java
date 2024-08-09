package loops;

public class DemoWhileLoop {
    public static void main(String[] args) {

        //SYNTAX : SYNTAX:  while (condition){
        //                                   //code
        //			                  increment/decrement;
        //                         }

        int i=0; // 0,1,2,3,4
        while (i<5){
            System.out.println("Hello World "+i);
            i++;
        }

        while (i>0){
            System.out.println("Decrement: Hello world "+i);
            i--;
        }


    }
}
