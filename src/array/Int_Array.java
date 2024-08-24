package array;

public class Int_Array {

    public static void main(String[] args) {


        // write a code for int array

        int distance[] = {75, 55, 500, 4000, 800,};
         System.out.println("print distance.."+distance[2]);

        for (int i = 0; i < distance.length; i++) {
            System.out.println("Printing using loop..." + distance[i]);
        }
        int j = 0;
        while (j < distance.length) {
            System.out.println("Printing using while loop.." + distance[j]);
            j++;
        }
        int l = 3;
        do {
            System.out.println("Pirnting using do while loop..." +distance+l);
            break;
        } while (l < 3);
         l--;
        // advanced for loops

        for (int var : distance) {
            System.out.println("Printing using advanced loop..." + var);


        }

    }
}








