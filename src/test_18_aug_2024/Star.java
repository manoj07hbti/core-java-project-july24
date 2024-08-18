package test_18_aug_2024;

public class Star {

    public static void main(String[] args) {

        //star value increment


        //      *     1
        //      **     12
        //      ***     123
        //        **      12
        //         *       1
        //          *      1
        //         **      2
        //        ***      3
        //         ****    4
        //        *****    5
        int number = 3;  //this number use increment
        number = 2;   // this number use decrement
        number = 5;   // this number use increment
        // value put on 01 to 03 only increment star

        for (int i = 1; i <= 3; i++) {

            for (int k = 1; k <= i; k++) {

                System.out.print("*");
            }
            System.out.println();
        }

        //star value Decrement
        // value put on 02 to 01 only Decrement star

        for (int i = 2; i >= 1; i--) {

            for (int k = 1; k <= i; k++) {

                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {

            for (int k = 1; k <= i; k++) {

                System.out.print("*");
            }
            System.out.println();
        }


    }
}
