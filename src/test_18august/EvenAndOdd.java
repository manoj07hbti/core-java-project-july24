package test_18august;

public class EvenAndOdd {

    public static void main(String[] args) {


        // write a code to check even and odd numbers b/w 300 to 10

        int number = 10;

        for (int i = 300; i >= 10; i--) {
            if (i % 2 == 0) {
                System.out.println("EVEN NUMBERS..." + i);
            } else {
                System.out.println("ODD numbers..." + i);
            }
        }

    }


}
