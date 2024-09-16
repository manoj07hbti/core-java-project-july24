package test_15_sep;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindPrime {

    public String prime() {
        String result = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter prime number");
        int prime = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                result = "not prime because it is divisible by other number:" + i;
                isPrime = false;
            }
        }

        if (isPrime) {
            result = "***number is prime:" + prime;
        } else {
            result = "number is not prime:" + prime;
        }

        return result;
    }

    public static void main(String[] args) {
        String choice = "Y";
        while (choice == "Y") {
            Scanner scanner = new Scanner(System.in);


            FindPrime obj = new FindPrime();
            System.out.println(obj.prime());

            System.out.println("please for check new prime number press Y or for exit press any number..");
           Scanner scanner_1 = new Scanner(System.in);
           choice =scanner_1.nextLine();
}
}
}