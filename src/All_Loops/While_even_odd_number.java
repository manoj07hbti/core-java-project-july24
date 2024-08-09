package All_Loops;

public class While_even_odd_number {

    public static void main(String[] args) {

        //SYNTAX : SYNTAX:  while (condition){
        //                                   //code
        //			                  increment/decrement;
        //                         }


        // print even numbers 1 to 100


        // print even numbers 1 to 100

        int i = 2;

        while (i <= 100) {

            if (i % 2 == 0)
                System.out.println(i + "");
            i++;

        }

        // print odd numbers 1 to 100

          i=2;
            while(i<=100) {
            if (i % 2 != 0) {
                System.out.println(i + "");
                i++;
            }
        }


    }
}
