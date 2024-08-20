package array;

public class ArrayStringClass {

    public static void main(String[] args) {

        // store name of 10 person

        //SYNTAX : Datatype varName [] = {value1, value2,value3.......valune N};

        //country names by using array

        String country [] = {"INDIA","DENMARK","FINLAND","RUSSIA","CHINA"};
        System.out.println("countries names are:"+country[0]);

       //1) by using for loop
        for(int i=0; i<country.length; i++){
            System.out.println("FOR loops:"+ country[i]);
        }

        // 2)by using while loop
        int k=1;
        while(k<country.length){
            System.out.println("WHILE loop:"+ country[k]);
            k++;
        }

        //3)by using advance loop
        //SYNTAX: for (Datatype varName : arrayName){
        //                   //CODE
        //              }

        for(String var: country){
            System.out.println("ADVANCE FOR LOOP:"+ var);
        }
        }
}
