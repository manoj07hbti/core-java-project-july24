package Methods;

public class Even_Odd_number {

    public void Even_Odd() {


        int number = 100;

        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("EVEN NUMBERS..." + i);
            } else {
                System.out.println("*********ODD numbers..." + i);
            }
        }

    }

    public static void main(String[] args) {

        Even_Odd_number obj = new Even_Odd_number();

        obj.Even_Odd();


    }


}
