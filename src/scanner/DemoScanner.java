package scanner;

import java.util.Scanner;

public class DemoScanner {

    // write a method which take String input from user and print

    public void takeStringInput(){

        Scanner scanner= new Scanner(System.in); //we have created object of Scanner class
        System.out.println("Please enter your name: ");
        String name=  scanner.nextLine(); // it reads String input and return you the value
        System.out.println("You have entered name as :"+name);

    }

    // take integer input
    public void takeIntInput(){
        Scanner scanner= new Scanner(System.in); //we have created object of Scanner class
        System.out.println("Please enter your age :");
        int age= scanner.nextInt(); // it reads integer value and return you back
        System.out.println("You have entered age as :"+age);
    }

    // take Double input
    public void takeDoubleInput(){
        Scanner scanner= new Scanner(System.in); //we have created object of Scanner class
        System.out.println("Please enter your Salary :");
        double salary= scanner.nextDouble(); // it reads Double value and return you back
        System.out.println("You have entered salary as :"+salary);
    }

    public static void main(String[] args) {
        DemoScanner obj= new DemoScanner();
        obj.takeStringInput();
        obj.takeIntInput();
        obj.takeDoubleInput();
    }






}
