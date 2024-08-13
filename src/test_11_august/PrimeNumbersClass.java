package test_11_august;

public class PrimeNumbersClass {

    public static void main(String[] args) {


        //10)write a program to check prime numbers between 1 to 20

        for (int number = 2; number <= 20; number++) {
            boolean isPrime = true;

            for (int i = 2; i <number; i++) {
                if (number % i == 0) {
                    System.out.println("given number is divisible by other numbers so it is not prime:" + i);
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("************* NUMBER IS PRIME:" + number);
            } else {
                System.out.println("given number is not prime:" + number);
            }
        }
    }
}