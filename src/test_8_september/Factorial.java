package test_8_september;

public class Factorial {

    public int checkFactorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int Factorial = obj.checkFactorial(5);
        System.out.println(Factorial);
    }


}