package Methods;

public class Return_type {

    // 01 write a code for even and odd numbers

    public boolean EvenOdd(int number) {

        if (number % 2 == 0) {

            return true;

        } else {
            return false;
        }
    }


    //02 check prime numbers

    public boolean checkPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                isPrime = false;
            }
        }
        return isPrime;
    }

    //03  find factorial

    public int checkFactorial(int number) {
        int factorial = 1;

        for (int i = number; i > 0; i--) {

            factorial = factorial * i;
        }
        return factorial;
    }

    //04  create calculator

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


    // 05 student division

    public double checkDivision(int subj1marks, int subj2marks, int subj3marks, int subj4marks) {

        double percentage = ((double) (subj1marks + subj2marks + subj3marks + subj4marks) / 400) * 100;

        return percentage;

    }

    public static void main(String[] args) {

        Return_type obj = new Return_type();

        boolean result = obj.EvenOdd(126);

        System.out.println(result);

        if (result) {

            System.out.println("Even numbers...");

        } else {

            System.out.println("odd numbers...");
        }


        boolean isPrime = obj.checkPrime(95);

        System.out.println(isPrime);

        if (isPrime) {

            System.out.println("Number is  prime ");

        } else {

            System.out.println("not a prime number");
        }


        int Factorial = obj.checkFactorial(15);

        System.out.println(Factorial);


        int Addition = obj.addition(35, 55);

        System.out.println(Addition);

        int Substraction = obj.substraction(123, 75);

        System.out.println(Substraction);

        int Multiplication = obj.multiplication(44, 33);

        System.out.println(Multiplication);

        int Division = obj.division(78, 76);

        System.out.println(Division);


    }


}

