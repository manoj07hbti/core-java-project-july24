package test_25_aug_2024;

public class Sum_Array {

    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5};
        int var = number.length;
        int sum = 0;
        for (int i = 0; i < var; i++) {

            sum = sum + number[i];
            System.out.println("sum of elements of array" + sum);


        }
    }
}