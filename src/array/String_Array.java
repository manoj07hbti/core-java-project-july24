package array;

public class String_Array {


    public static void main(String[] args) {

        //SYNTAX: Datatype varname []= {value1, value 2, value3, ......valueN};

        // write a code to string array country

        String country[] = {"USA", "PAKISTAN", "DUBAI", "INDIA",};

        System.out.println("print country..." + country[2]);
        //  for loop
        for (int i = 0; i <= country.length; i++) {
            System.out.println("print loop country name.. " + country[i]);
        }
       // while loop

        int l=0;
        while(l<=country.length){
            System.out.println("print using while loop.."+country [l]);
            l++;
        }
     //  advance loop
        for(String var :country){
            System.out.println("print using advance loop.."+var);
        }



    }


    }
