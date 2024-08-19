package demo_array;

public class DemoArray {

    public static void main(String[] args) {

        // store name of 10 person

        //SYNTAX : Datatype varName [] = {value1, value2,value3.......valune N};

        String names [] = { "Raj","Rohit","Mukesh","Mohit","Jatin","John","Rahul","Jitendra","Test"};

        System.out.println("Printing Data: "+ names[6] );

        for (int i=0; i<names.length; i++){
            System.out.println("Printing in loop : "+names[i]);
        }
        int j=0;
        while (j<names.length){

            System.out.println("Printing using while loop..."+ names[j]);
            j++;
        }

        //SYNTAX: for (Datatype varName : arrayName){
        //                   //CODE
        //              }

        for(String var : names){

            System.out.println("Printing using Advanced loop..."+var);
        }


        int marks []={35,56,32,77,95,45,76};

        for(int var: marks){
            System.out.println("Printing Marks: "+var);
        }
    }
}
