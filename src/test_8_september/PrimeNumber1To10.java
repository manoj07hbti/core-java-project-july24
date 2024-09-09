package test_8_september;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class PrimeNumber1To10 {

    public boolean checkPrime(int number) {

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;


    }

    public static void main(String[] args) {
        PrimeNumber1To10 obj = new PrimeNumber1To10();
        boolean isPrime = obj.checkPrime(5);
        System.out.println(isPrime);
        if (isPrime) {
            System.out.println("Number is prime...");
        } else {
            System.out.println("Number is not prime...");
        }

    }


}
