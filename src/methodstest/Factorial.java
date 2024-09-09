package methodstest;

import methods.FactorialInput;

public class Factorial {
    public int factorial(int a) {
        int fact = 1;
        for (int i = a; i > 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int result = f.factorial(6);
        System.out.println(result);
    }
}
