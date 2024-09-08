package test_8_september;

public class CheckNumberBetween5To150 {

    public void checkNumbers() {
        for (int i = 5; i <= 150; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        CheckNumberBetween5To150 obj = new CheckNumberBetween5To150();
        obj.checkNumbers();
    }


}
