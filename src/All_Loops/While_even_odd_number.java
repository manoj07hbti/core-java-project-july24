package All_Loops;

public class While_even_odd_number {

    public static void main(String[] args) {

        //SYNTAX : SYNTAX:  while (condition){
        //                                   //code
        //			                  increment/decrement;
        //                         }

        // print even numbers 1 to 100

        int i = 1;

        while (i <= 100) {

            if (i % 2 == 0)

                System.out.println(i + "");
            i++;

        }

        // print odd numbers 1 to 100

        int j=1;
        while(j<=100) {
            if (j % 2 != 0) {
                System.out.println(j + "");
                j++;
            }
        }



    }
}