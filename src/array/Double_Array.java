package array;

public class Double_Array {

    public static void main(String[] args) {


        // write a code for double array height

        double height[] = {6, 6.5, 7, 6.5, 6, 8};
        for (int i = 0; i < height.length; i++) {
            System.out.println("Printing height using loop.." + height[i]);
        }

        // while

        int k = 0;
        while (k < height.length) {
            System.out.println("Printing using while loop..." + height[k]);
            k++;
        }



        // do while
        int j = 0;
        do {
            System.out.println("Printing using do while.." + height.length);
            break;
        } while (j < 4);
        j--;


        // advanced loops
        for (
                double var : height) {
            System.out.println("Printing using advanced loop..." + var);
        }
    }

}





















