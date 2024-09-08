package scanner;

import java.util.Scanner;

public class ScannerCalculator {

    // create a calculator using scanner

    public String checkAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide value of a..");
        int a = scanner.nextInt();
        System.out.println("Please provide value of b...");
        int b = scanner.nextInt();
        int result = a + b;
        return "Addition of given number a is " + a + " and b is " + b + " is: " + result;
    }

    public String checkSubstraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide value of a..");
        int a = scanner.nextInt();
        System.out.println("Please provide value of b...");
        int b = scanner.nextInt();
        int result = a - b;
        return "Substraction of given number a is " + a + " and b is " + b + "is: " + result;
    }

    public String checkMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide value of a...");
        int a = scanner.nextInt();
        System.out.println("Please provide value of b...");
        int b = scanner.nextInt();
        int result = a * b;
        return "Multiplication of given number a is " + a + " and b is " + b + " is: " + result;
    }

    public String checkDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide value of a...");
        int a = scanner.nextInt();
        System.out.println("Please provide value of b...");
        int b = scanner.nextInt();
        int result = a / b;
        return "Division of given number a is " + a + " and b is" + b + " is: " + result;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to calculator app... Please ente your choice 1: Addtion 2: SUbstraction 3: Multiolication 4: Division");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        ScannerCalculator obj = new ScannerCalculator();

        if (choice == 1) {
            System.out.println("printing addition");
        } else if (choice == 2) {
            System.out.println("printing substraction");
        } else if (choice == 3) {
            System.out.println("Printing multiplication");
        } else if (choice == 4) {
            System.out.println("Printing division");
        } else {
            System.out.println("Not found values..");
        }
    }

}




