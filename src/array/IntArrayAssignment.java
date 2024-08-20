package array;

public class IntArrayAssignment {

    public static void main(String[] args) {


    // write a code for int array

    int distance[] = {65, 64, 3000, 2000, 1000};

       for(int i=0; i<distance.length; i++){
           System.out.println("Printing using loop..."+distance[i]);
       }
        // advanced for loops

        for(int var: distance){
            System.out.println("Printing using advanced loop..."+var);
        }

        int j=0;
        while(j<distance.length){
            System.out.println("Printing using while loop.."+distance[j]);
        }
         int k=4;
        do{
            System.out.println("Pirnting using do while loop..."+ distance[k]);
        } while(k<=4);


}

}


