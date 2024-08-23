package demo_arrey;

public class Demo2_Array {


    public static void main(String[] args) {


  //String array country
        //int array distance
        //double array height
        //while loop
        //do while
        //for loop
        //advanced loop

         //SYNTAX : Datatype varName [] = {value1, value2,value3.......value N};

            //String array country

    String city [] ={"INDIA","AMERICA","THAILAND","PARIS","","PAKISTAN","DUBAI","CANADA"};{
            System.out.println("printing data--"+city[6]);

        }

           // WITH FOR LOOP

        for(int i=0; i<=7; i++){
            System.out.println("printing data for loop---"+city[i]);
        }

          // WITH ADVANCED LOOP

       for(String num : city){
           System.out.println("printing with advanced loop---"+num);
       }

       // WITH WHILE LOOP

        int h=0;
       while (h<city.length){
           System.out.println("printing with while loop----"+city[h]);
           h++;
       }

       //WITH DO WHILE LOOP

      do{
          System.out.println("printing with do while loop----"+city);
          h++;
      } while(h<= city.length);









    }
}
