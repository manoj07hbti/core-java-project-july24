package scanner;

import java.util.Scanner;

public class Demo {
    public void takeStringInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Name: ");
      String name=  scanner.nextLine();//it reads string input and return.
        System.out.println("You have entered name as: "+name);
    }
    public void takeDoubleInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Salary: ");
        double salary=  scanner.nextDouble();//it reads double input and return.
        System.out.println("You have entered salary as: "+salary);
    }
    public void takeIntInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Age: ");
        int age=  scanner.nextInt();//it reads int input and return.
        System.out.println("You have entered age as: "+age);
    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.takeStringInput();
        obj.takeDoubleInput();
        obj.takeIntInput();
    }
}
