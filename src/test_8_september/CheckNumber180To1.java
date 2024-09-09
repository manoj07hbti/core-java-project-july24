package test_8_september;

public class CheckNumber180To1 {

    public void checkNumber() {
        for (int i = 180; i >= 1; i--) {
            if (i % 11 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        CheckNumber180To1 obj = new CheckNumber180To1();
        obj.checkNumber();
    }
}
