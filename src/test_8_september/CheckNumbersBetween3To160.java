package test_8_september;

public class CheckNumbersBetween3To160 {
// write a code to check number b/w 3to 160 divisible by 9 and it should be not an odd number

    public void checkNumber() {
        for (int i = 3; i <= 160; i++) {
            if (i % 9 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        CheckNumbersBetween3To160 obj = new CheckNumbersBetween3To160();
        obj.checkNumber();
    }

}
