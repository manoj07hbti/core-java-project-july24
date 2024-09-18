package test_15_sept;

import java.io.InputStream;

public class Scanner {


    public static void main(String[] args) {

        Scanner input = new Scanner();

        System.out.println("2,3,4,6,7,17,20,23,32,45,50.. :");


        int l = input.nextInt();

        int[] a = new int[l];

        int max = 0, min = 0;

        for (int i = 0; i < l; i++) {
            System.out.println();

            a[i] = input.nextInt();
        }
        min = a[0];

        for (int i = 0; i < l; i++) {
            if (max < a[i])

                max = a[i];

            if (min > a[i])

                min = a[i];
        }
        System.out.println("Maximum Element of Array : " + max);

        System.out.println("Minimum Element of Array : " + min);
    }

    private int nextInt() {


        return 0;
    }
}


