package array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers ={84, 54, 84, 54, 84, 56, 32, 85, 39, 84, 64, 64, 34, 84, 18, 54, 84, 54, 64, 84, 68, 64, 49, 43, 46};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ascending ordrer: " + numbers[i]);
        }

            for (int i = 24; i <= numbers.length; i--) {
                if(i>=0){
                System.out.println("descending order: " + numbers[i]);

            }


        }
    }
}
