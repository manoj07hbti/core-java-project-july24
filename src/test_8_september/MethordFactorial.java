package test_8_september;

public class MethordFactorial {


    public class Factorial {

        public int checkFactorial(int number) {
            int factorial = 1;
            for (int i = number; i > 0; i--) {
                factorial = factorial * i;
            }
            return factorial;
        }

    }
        public static void main(String[] args) {
            MethordFactorial obj = new MethordFactorial();
           obj.Factorial();

        }


}
