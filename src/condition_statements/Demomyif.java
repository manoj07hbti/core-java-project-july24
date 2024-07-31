package condition_statements;

import com.sun.xml.internal.ws.resources.BindingApiMessages;

public class Demomyif {


    public static void main(String[] args) {


        //  SYNTAX : if(condition){
        //  code
        //  }


        int age=22;

        if (age>18){
            System.out.println("welcome to voting system");


            int notage=17;
            if(notage<18);{
                System.out.println("you are not elligible for voting");

            }
        }

         int passedmarks=55;
         if (passedmarks>33){
             System.out.println("he is cleared the exam");
         }


         int failmarks=30;
         if (failmarks<33){
             System.out.println("he is not cleared exam");
         }


         String country="india";
         if (country=="dubai");{
             System.out.println("person is from india"+country);
         }


        if (country !="india");{
            System.out.println("person is from india"+country);

        }


        int hight=6;
        if (hight>6);{
            System.out.println("candidate is tall"+hight);
        }


        if (hight<5);{
            System.out.println("candidate is not tall"+hight);
        }




    }











}
