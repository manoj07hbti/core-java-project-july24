package test_08_sept_2024;

public class Check_number_7_to_190 {

    public static class CheckNumbers {

        public void checkNumbers() {
            for (int i = 7; i <= 190; i++) {
                if (i % 7 != 0 && i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        public static void main(String[] args) {
            CheckNumbers obj = new CheckNumbers();
            obj.checkNumbers();
        }

    }
}
