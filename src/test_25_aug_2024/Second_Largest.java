package test_25_aug_2024;

public class Second_Largest {

    public static void main(String[] args) {

        int[] number = {12, 35, 1, 10, 34, 1};
        int first = number[0], second = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] > first) {

                second = first;
                first = number[i];

            } else if (number[i] > second) {
                second = number[i];

                System.out.println("second length number" + second);

            }

        }

    }
}
