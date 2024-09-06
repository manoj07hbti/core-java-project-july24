package scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Pleas Enter you Name: ");
        String name = sc.nextLine();

        System.out.println("Please Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Please Enter your Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(percentage);
    }

}
