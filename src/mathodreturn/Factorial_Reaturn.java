package mathodreturn;

public class Factorial_Reaturn {

    // write a code to find factorial

    public int checkFactorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial_Reaturn obj = new Factorial_Reaturn();

        int Factorial = obj.checkFactorial(5);
        System.out.println(Factorial);


    }


}

