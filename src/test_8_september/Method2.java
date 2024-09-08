package test_8_september;

public class Method2 {

    public void checkOdd() {
        int number = 190;
        for (int i = 7; i <= 190; i++) {
            if (i % 7 == 0) {
                System.out.println("odd number.." + i);
            }
        }

    }
    public static void main(String[] args) {

            Method2 obj = new Method2();
            obj.checkOdd();

        }

    }



