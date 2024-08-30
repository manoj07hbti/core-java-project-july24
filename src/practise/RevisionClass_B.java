package practise;

import java.util.Arrays;

public class RevisionClass_B {


    public static void main(String[] args) {

        //bubble sort

        int a[] = {36, 19, 29, 12, 5};
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }


        //maximum element

        int b[] = {7,9,11,13,17,19};

      int maxi=b[0];
        for (int k = 0; k < b.length; k++) {
            if (b[k] > maxi) {
                maxi = b[k];
            }
        }
        System.out.println("max. number in array is:"+maxi);
    }
}
