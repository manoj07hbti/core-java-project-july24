package test_8_september;

public class PrimeNumber10To20 {

    // write a code for prime number b/w 10 to 20;

    public boolean checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 10; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;

            }
        }
        return isPrime;


    }

    public static void main(String[] args) {
        PrimeNumber10To20 obj = new PrimeNumber10To20();
        boolean isPrime = obj.checkPrime(20);
        System.out.println(isPrime);
        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }


}
