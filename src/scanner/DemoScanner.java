package scanner;

import java.util.Scanner;

public class DemoScanner {

    // write a method which will take String input

    public void takeStringInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your name");
        String name = scanner.nextLine();
        System.out.println(" your name is...." + name);
    }

    // write a method which will take Int input

    public void takeIntOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your age...");
        int age = scanner.nextInt();
        System.out.println("Your age is...." + age);
    }

    // write a method which will take double output

    public void takeDoubleOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your salary");
        double salary = scanner.nextDouble();
        System.out.println("The salary is...." + salary);
    }

    public static void main(String[] args) {
        DemoScanner obj = new DemoScanner();
        obj.takeStringInput();
        obj.takeIntOutput();
        obj.takeDoubleOutput();
    }
}










