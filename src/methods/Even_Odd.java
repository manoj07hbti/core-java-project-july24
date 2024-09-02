package methods;

public class Even_Odd {

    public void makeEvenOdd() {
        int numbers = 100;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Printing even numbers..." + i);
            } else {
                System.out.println("Odd numbers...");
            }
        }


    }

    public static void main(String[] args) {
        Even_Odd obj = new Even_Odd();

        obj.makeEvenOdd();


    }
}