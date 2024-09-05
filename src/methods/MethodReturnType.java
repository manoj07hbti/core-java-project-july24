package methods;

public class MethodReturnType {

    // write a code to find factorial

    public int checkFactorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // write a code for even and odd numbers

    public boolean checkEvenAndOdd(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // write a code to check prime numbers

    public boolean checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    // write a code to check student division

    public double checkDivision(int subj1marks, int subj2marks, int subj3marks, int subj4marks, int subj5marks, int subj6marks) {
        double percentage = ((double) (subj1marks + subj2marks + subj3marks + subj4marks + subj5marks + subj6marks) / 600) * 100;
        return percentage;
    }

    // write a code to create calculator

    public int addition(int a, int b) {
        int add = a + b;
        return add;
    }

    public int substraction(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multiplication(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public int division(int a, int b) {
        int divide = a / b;
        return divide;
    }

    public static void main(String[] args) {
        MethodReturnType obj = new MethodReturnType();
        int Factorial = obj.checkFactorial(5);
        System.out.println(Factorial);

        boolean evenAndOdd = obj.checkEvenAndOdd(225);
        System.out.println(evenAndOdd);
        if (evenAndOdd) {
            System.out.println("Even numbers...");
        } else {
            System.out.println("odd numbers...");
        }

        boolean isPrime = obj.checkPrime(37);
        System.out.println(isPrime);
        if (isPrime) {
            System.out.println("Number is  prime ");
        } else {
            System.out.println("not a prime number");
        }

        double percentage = obj.checkDivision(60, 65, 70, 79, 85, 100);
        System.out.println(percentage);
        if (percentage >= 50 && percentage < 70) {
            System.out.println("First division");
        } else if (percentage >= 75 && percentage < 80) {
            System.out.println("Brilliant student...");
        } else if (percentage >= 80 && percentage <= 100) {
            System.out.println("Topper of the college...");
        } else {
            System.out.println("Failed in class");
        }

        int Addition = obj.addition(25, 25);
        System.out.println(Addition);
        int Substraction = obj.substraction(225, 25);
        System.out.println(Substraction);
        int Multiplication = obj.multiplication(25, 25);
        System.out.println(Multiplication);
        int Division = obj.division(25, 5);
        System.out.println(Division);
    }

}
