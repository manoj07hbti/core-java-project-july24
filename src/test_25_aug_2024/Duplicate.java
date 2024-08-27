package test_25_aug_2024;

public class Duplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 2, 3, 5, 6, 8,};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println("duplicate element" + arr[i]);
                }
            }
        }
    }
}
