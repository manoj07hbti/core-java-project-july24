package test_15_sep;

import java.util.Scanner;

public class Prime {

    public void checkPrime() {
        int number = 0;
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Number divisible by other number hence it is not prime" + number);
                isPrime = false;
            }
        }
    }

    public static void main(String[] args) {
        String rechoice = "Y";
        Scanner scanner = new Scanner(System.in);
        Prime obj = new Prime();
        System.out.println("Do you want to find more prime number press Y and if you have to exit press any key");
        String choice =
                scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            obj.checkPrime();
            while (rechoice.equalsIgnoreCase("Y")) {
                System.out.println("Do you want to find more prime number press Y and if you have to exit press any key");
                rechoice = scanner.next();
                if (rechoice.equalsIgnoreCase("Y")) {
                    obj.checkPrime();
                } else {
                    System.out.println("EXit");
                }
            }
        }

    }
}


