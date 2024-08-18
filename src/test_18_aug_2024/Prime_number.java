package test_18_aug_2024;

public class Prime_number {

    public static void main(String[] args) {

        //prime numbers  15 to 30


        for (int number = 15; number <= 30; number++) {

            boolean isPrime = true;
            // int number 23

            for (int i = 15; i < number; i++) {

                if (number % i == 0) {
                    System.out.println("Number is divisible by other number hence not prime ..." + i);
                    isPrime = false;
                }
            }


            if (isPrime) {
                System.out.println("@@@@@@@ Number is prime: " + number);
            } else {
                System.out.println("Number is NOT prime: " + number);
            }


        }

    }
}
