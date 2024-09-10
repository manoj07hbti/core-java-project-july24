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

        String rechoice = "Y";
        while (rechoice.equals("Y")) {
            System.out.println("Welcome to calculator app... Please ente your choice 1: Addtion 2: SUbstraction 3: Multiolication 4: Division");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            ScannerCalculator obj = new ScannerCalculator();

            if (choice == 1) {
                System.out.println(obj.checkAddition());
            } else if (choice == 2) {
                System.out.println(obj.checkSubstraction());
            } else if (choice == 3) {
                System.out.println(obj.checkMultiplication());
            } else if (choice == 4) {
                System.out.println(obj.checkDivision());
            } else {
                System.out.println("Not found values..");
            }
        }

        System.out.println("Do you want to continue press Y and not press N");
        Scanner scanner_1 = new Scanner(System.in);
        rechoice = scanner_1.nextLine();
    }

}







