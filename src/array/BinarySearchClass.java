package array;
import java.lang.reflect.Array;
import java.util.Arrays;
public class BinarySearchClass {

    public static void main(String[] args) {

        int marks[] = {23, 45, 56, 76, 32, 65, 48, 78, 33};

        int target = 22;

        int start = 0;
        int end = marks.length-1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (marks[mid] == target) {
                System.out.println("The number is found at position:" + mid);
                break;
            } else if (marks[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        System.out.println(-1);


        int num[] ={1,2,3,4,5,6,7,8,9};

        int element = 8;

        start=0;
        end=num.length-1;

        while(start<=end) {

            int mid = (start + end) / 2;

            if (num[mid] == element) {
                System.out.println("index:" + mid);
                break;
            } else if (num[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        }
    }


