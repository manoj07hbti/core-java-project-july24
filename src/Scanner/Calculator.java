package Scanner;

import java.util.Scanner;

public class Calculator {


    public String add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b = scanner.nextInt();
        int result = a + b;
        return "Addition of given number a- " + a + " and b- " + b + " is : " + result;
    }

    public String sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b = scanner.nextInt();
        int result = a - b;
        return "Addition of given number a- " + a + " and b- " + b + " is : " + result;
    }

    public String multi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b = scanner.nextInt();
        int result = a * b;
        return "Addition of given number a- " + a + " and b- " + b + " is : " + result;
    }

    public String div() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b = scanner.nextInt();
        int result = a / b;
        return "Addition of given number a- " + a + " and b- " + b + " is : " + result;
    }


    public static void main(String[] args) {


        System.out.println("Welcome to calculator App..., Please enter your choice : 1. Add, 2.Sub, 3, Multi and 4." + "div..");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        Calculator obj = new Calculator();


        if (choice == 1) {

            //call addition
            System.out.println(obj.add());

        } else if (choice == 2) {

            //call sub
            System.out.println(obj.sub());

        } else if (choice == 3) {

            //call multiply
            System.out.println(obj.multi());

        } else if (choice == 4) {

            //call divide
            System.out.println(obj.div());
        }
    }

}









