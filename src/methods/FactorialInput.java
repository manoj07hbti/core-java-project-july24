package methods;

public class FactorialInput {
    public void Factorial(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= i; j++) {

            }
            System.out.println(number * i);
        }
    }

    public static void main(String[] args) {
        FactorialInput factorial=new FactorialInput();
        factorial.Factorial(7);
    }
}
