package test_15_september;

import java.util.Scanner;

public class PrimeNumber {

    public void checkPrime() {
        int number = 0;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Number divisible by other number hence it is not prime");
                isPrime = false;
            }
        }
    }

    public static void main(String[] args) {
        String choice = "Y";
        while (choice.equals("Y")) {
            Scanner scanner = new Scanner(System.in);
            PrimeNumber obj = new PrimeNumber();
            obj.checkPrime();

            System.out.println("Do you want to check more prime number press Y and if work is complete then press any key");
            Scanner scanner1 = new Scanner(System.in);
            choice = scanner1.nextLine();
        }
    }


}
