package test_18_aug_2024;

public class Even_And_Odd_number {

    public static void main(String[] args) {


        // even number 10 to 300

        int number = 300;

        for (int i = 10; i <= 300; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
        }

        // print odd numbers 10 to 300

        number = 300;
        for (int k = 10; k <= 300; k++) {
            if (k % 2 != 0) {
                System.out.println(k + "");
            }
        }


    }
}
