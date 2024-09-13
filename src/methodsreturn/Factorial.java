package methodsreturn;

public class Factorial {
    public int factorial(int a) {
        int fact = 1;
        for (int i = a; i > 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        methodstest.Factorial f = new methodstest.Factorial();
        int result = f.factorial(11);
        System.out.println(result);
    }
}
