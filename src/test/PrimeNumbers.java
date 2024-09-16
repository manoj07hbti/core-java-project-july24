package test;

public class PrimeNumbers {
    public static void main(String[] args) {
            boolean isPrime = true;
            int number=15;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("not prime because divisible by: " + i);
                    isPrime = false;
                    break;


                }
            }

            if (isPrime) {
                System.out.println("*******Prime Number: " + number);
            } else {
                System.out.println("Non Prime number :" + number);
            }
        }
    }
