package loops;

import java.sql.SQLOutput;

public class DoWhile_Loops {

    public static void main(String[] args) {


        //SYNTAX:      do {
        //                   CODE
        //                  increment/decrement;
        //                } while(condition);

         // INCREMENT

        int i=1;
        do{
            System.out.println("DEMO WHILE DO......."+i);
            i++;
        } while (i<=5);

         //DECREMENT

        do{
            System.out.println("DECREMENT WHILE DO....."+i);
            i--;
        } while (i>=2);

        // INCREMENT

         int k=10;
         do{
             System.out.println("AGAIN INCREMENT WHILE DO.."+k);
             k++;
         } while (k<50);


       //DECREMENT

        do{
            System.out.println("AGAIN DECREMENT WHILE DO........"+k);
            k--;
        } while(k>=10);

        // INCREMENT

        int m=0;
        do{
            System.out.println("while do again.."+m);
            m++;
        } while (m<=20);








    }










}
