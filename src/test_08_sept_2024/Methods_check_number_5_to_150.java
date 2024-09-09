package test_08_sept_2024;

public class Methods_check_number_5_to_150 {

    //01 Check number 5 to 150

    public static class CheckNumber {

        public void checkNumbers() {
            for (int i = 5; i <= 150; i++) {
                if (i % 3 == 0 && i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

            public static void main(String[] args) {

            CheckNumber obj = new CheckNumber();

            obj.checkNumbers();
        }


    }
}
