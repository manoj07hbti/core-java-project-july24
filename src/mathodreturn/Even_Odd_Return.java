package mathodreturn;

public class Even_Odd_Return {

    // write a code for even and odd numbers

    public boolean checkEvenAndOdd(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Even_Odd_Return obj = new Even_Odd_Return();

        boolean evenAndOdd = obj.checkEvenAndOdd(225);
        System.out.println(evenAndOdd);
        if (evenAndOdd) {
            System.out.println("Even numbers...");
        } else {
            System.out.println("odd numbers...");
        }
    }
}