package test_15_sept;

import java.util.Random;

public class Maximum_array {


        public static void main(String[] args) {



            System.out.print("2,3,4,6,7,17,20,23,32,45,50.....:");

            Random input = null;
            int l = input.nextInt();

            int[] a = new int[l];

            int max = 0, min = 0;

            for (int i = 0; i < l; i++) {

                System.out.printf("Element of a[%d] :", i);

                a[i] = input.nextInt();

            }
            max = a[0];

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

}
