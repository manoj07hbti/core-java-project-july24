package test;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int number = 15; number <= 30; number++) {
            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("not prime because divisible by: " + i);
                    isPrime = false;


                }
            }

            if (isPrime) {
                System.out.println("*******Prime Number: " + number);
            } else {
                System.out.println("Non Prime number :" + number);
            }
        }
    }
}