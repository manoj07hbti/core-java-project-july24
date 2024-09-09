package test_8_september;

public class CheckNumbersBetween7To190 {

    public void checkNumbers() {
        for (int i = 7; i <= 190; i++) {
            if (i % 7 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        CheckNumbersBetween7To190 obj = new CheckNumbersBetween7To190();
        obj.checkNumbers();
    }

}
