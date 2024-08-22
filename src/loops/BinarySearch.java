package loops;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60};
        int element = 20;

        int start= 0;
        int end= arr.length - 1;

        while(start<=end){

           int mid = (start + end) / 2;

            if(arr[mid] == element ){
                System.out.println(mid);
                return;
            } else if (arr[mid] < element) {
                start = mid +1;
            } else {
                end = mid -1;
            }

        }
    }
}
