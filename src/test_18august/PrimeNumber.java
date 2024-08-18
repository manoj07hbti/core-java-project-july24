package test_18august;

public class PrimeNumber {

    public static void main(String[] args) {


        // write a code to check prime numbers b/w 15 to 30

        for (int number = 15; number <= 30; number++) {
            boolean isPrime = true;

            // int number=17;
            for (int i = 15; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("number divisible by other number henec it is not prime..." + i);
                    isPrime = false;
                }

            }

            if (isPrime) {
                System.out.println("Number is prime...." + number);
            } else {
                System.out.println("Number is not prime.." + number);
            }
        }


    }


}
