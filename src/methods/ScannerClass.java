package methods;

import java.util.Scanner;

public class ScannerClass {


public void stringInput() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your name:");
    String name = scanner.nextLine();
    System.out.println("you have entered name as: " + name);

}

public void intInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your age:");
    int age= scanner.nextInt();
    System.out.println("you have enter your age as: " + age);
}

public void doubleInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your weight:");
    double weight = scanner.nextDouble();
    System.out.println("you have enter your weight as: " + weight);
}

    public static void main(String[] args) {
        ScannerClass obj = new ScannerClass();
        obj.stringInput();
        obj.intInput();
        obj.doubleInput();
    }
}
