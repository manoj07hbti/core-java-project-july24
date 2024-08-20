package array;

public class IntArray {
    public static void main(String[] args) {
        int distance[]={84,54,84,54,84,56,32,85,39,84,64,64,34,84,18,54,84,54,64,84,68,64,49,43,46};
        for(int i=0;i<distance.length;){
            System.out.println("Printing Marks using advanced for loop : "+distance[i]);
            i++;
        }
        int j=0;
        while (j<distance.length) {
            System.out.println("Printing Distance using While loop: " + distance[j]);
            j++;
        }
        int a=0;
        do{
            System.out.println("Printing Distance using do while loop: "+distance[a]);
            a++;
        }while (a<distance.length);
        for (int i = 0; i <= 24; i++) {
            System.out.println("Printing Distance using for loop : " + distance[i]);
        }
    }
}
