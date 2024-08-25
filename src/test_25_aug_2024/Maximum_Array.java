package test_25_aug_2024;

public class Maximum_Array {

    public static void main(String[] args) {


        int max[] = {1, 3, 5, 2, 4};

        //find the index of 5
        int i = 0;

        for (int var : max) {

            if (var == 5) {

                System.out.println("5 at the index of :" + i);

                break;
            }
            i++;

        }


    }
}
