package methods;

public class MethodsInput {

    // create cube

    public void makeCube(int number) {
        System.out.println("Cube of...." + number * number * number);
    }

    // check percentage

    public void checkPercentage(double number, double percent) {
        double result = (number * percent) / 100;
        System.out.println("Percentage of..." + result);
    }

    //check prime

    public void checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Number divisible by other number hence it is not prime..." + i);
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Number is prime..." + number);
        } else {
            System.out.println("Number is not prime..." + number);
        }
    }

    // check Factorial

    public void checkFactorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("factorial of given number is..." + factorial);
    }

    // create calculator

    public void createCalculator(int a, int b) {
        int add = a + b;
        System.out.println("Addition..." + add);
        int sub = a - b;
        System.out.println("Substraction..." + sub);
        int multi = a * b;
        System.out.println("Multiplication.." + multi);
        int divide = a / b;
        System.out.println("Division..." + divide);
    }

    public static void main(String[] args) {
        MethodsInput obj = new MethodsInput();
        obj.makeCube(5);
        obj.makeCube(10);
        obj.checkPercentage(5000, 10);
        obj.checkPercentage(100000, 50);
        obj.checkFactorial(10);
        obj.checkFactorial(5);
        obj.checkPrime(20);
        obj.checkPrime(13);
        obj.checkPrime(5);
        obj.createCalculator(10, 5);
        obj.createCalculator(10, 5);
        obj.createCalculator(50, 5);
        obj.createCalculator(10, 2);

    }


}
