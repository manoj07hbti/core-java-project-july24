package arrays;

public class Assignment1 {
    public static void main(String[] args) {

        //1- String array country
        String countries []= {"India", "Qatar", "Dubai", "Saudi Arabia", "Kuwait" };

        for(int i=0; i<countries.length; i++){
            System.out.println("Inside for loop: " +countries[i]);
        }

        int i=0;
        while(i<countries.length){
            System.out.println("Inside while loop: " +countries[i]);
            i++;
        }

        i=0;
        do {
            System.out.println("Inside do while loop: " +countries[i]);
            i++;
        } while (i<countries.length);




        //2- int array distance
        int distance []= { 45, 70, 85, 120, 456 ,130};

        for(int j=0; j<countries.length; j++){
            System.out.println("Inside for loop: " +distance[j]);
        }

        int j=0;
        while(j<countries.length){
            System.out.println("Inside while loop: " +distance[j]);
            j++;
        }

        j=0;
        do {
            System.out.println("Inside do while loop: " +distance[j]);
            j++;
        } while (j<countries.length);


        //3- double array height
        double height []= {5.11, 5.5, 5.6, 5.1, 5.7 , 5.8 };

        for(int k=0; k<countries.length; k++){
            System.out.println("Inside for loop: " +height[k]);
        }

        int k=0;
        while(k<countries.length){
            System.out.println("Inside while loop: " +height[k]);
            k++;
        }

        k=0;
        do {
            System.out.println("Inside do while loop: " +height[k]);
            k++;
        } while (k<countries.length);



    }
}
