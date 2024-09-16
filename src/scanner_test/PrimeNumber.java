package scanner_test;

import java.util.Scanner;

public class PrimeNumber {
    public String primenumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number: "+number);
        }else {
            System.out.println("Non-Prime Number: "+number);
        }
        return "";
    }

    public static void main(String[] args) {
        String choice = "y";
        while (choice.equals("y")) {
            Scanner scanner = new Scanner(System.in);
            PrimeNumber pn = new PrimeNumber();
            System.out.println("Number: ");
            pn.primenumber(scanner.nextInt());

            System.out.println("Do you want to check another number press 'y' for yes or 'n' to exit");
            Scanner s = new Scanner(System.in);
            choice = s.nextLine();
        }

    }
}
