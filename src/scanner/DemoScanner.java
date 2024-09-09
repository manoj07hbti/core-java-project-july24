package scanner;

import javax.xml.soap.Name;
import java.util.Scanner;

public class DemoScanner {


    //1.create DemoScanner class
    //take string input and read it , double, integer

    // write a method take a String input from user

    public void TakeString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME ");
        String name = scanner.nextLine();
        System.out.println("YOU ENTERED YOUR NAME AS:" + name);

    }
// write method with integer

    public void TakeInteger() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE ");
        int age = scanner.nextInt();
        System.out.println("YOU ENTERED YOUR AGE AS:" + age);

    }

    // WRITE A CODE WITH DOUBLE
    public void TakeDouble() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR PRICE ");
        double price = scanner.nextDouble();
        System.out.println("ENTER PRICE AS:" + price);


    }

    public static void main(String[] args) {
        DemoScanner obj = new DemoScanner();
        obj.TakeString();
        obj.TakeInteger();
        obj.TakeDouble();
    }

}
