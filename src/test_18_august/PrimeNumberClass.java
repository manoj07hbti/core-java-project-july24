package test_18_august;

public class PrimeNumberClass {

    public static void main(String[] args) {


        //4)write a program to check prime numbers between 15 to 30

        for (int number = 15; number <= 30; number++) {
            boolean isPrime = true;

            for (int i = 2; i <number; i++) {
                if (number % i == 0) {
                    System.out.println("divisible by other numbers so it is not prime:" + i);
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
