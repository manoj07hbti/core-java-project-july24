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

//=====================================================================================================================


        // int array distance
        //SYNTAX : Datatype varName [] = {value1, value2,value3.......value N};

        // with advanced loop

      int distance []= {500, 1000, 1500, 2000, 2500, 3000};
        {
            System.out.println("printing data distance");

            for (int mannu : distance) {
                System.out.println("printing distance....." + mannu);

            }

            // with for loop

            for (int m = 0; m <= 5; m++) {
                System.out.println("printing for loop..." + distance[m]);
            }

            // while loop
            int m = 0;
            while (m < distance.length) {
                System.out.println("printing with while loop....." + distance[m]);
                m++;
            }

            // with do while loop

            do {
                System.out.println("printing with do while loop----" + distance);
                h++;
            } while (m < distance.length);


            //double array height

            double height[] = {15, 45, 37, 152, 12, 36.54, 85.10, 99.99, 25, 87.14};
            {
                System.out.println("printing data height");
            }}


    }
}

