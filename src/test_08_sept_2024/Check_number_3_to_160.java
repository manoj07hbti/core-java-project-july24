package test_08_sept_2024;

public class Check_number_3_to_160 {

    public class CheckNumbers {

        public void Number() {
            for (int i = 3; i <= 160; i++) {
                if (i % 9 != 0 && i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        public void main(String[] args) {
            CheckNumbers obj = new CheckNumbers();
            obj.Number();
        }

    }
}
