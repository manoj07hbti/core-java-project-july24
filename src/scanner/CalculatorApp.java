package scanner;

import java.util.Scanner;

public class CalculatorApp {
    public String addtition(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a=scanner.nextInt();
        System.out.println("please enter value of b: ");
        int b=scanner.nextInt();
        int result=a+b;
        return "Addition of given number a: "+a+" and b: "+b+" is: "+result;
    }
    public String subtract(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a=scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b=scanner.nextInt();
        int result=a-b;
        return "Subtract of given number a: "+a+" and b: "+b+" is: "+result;
    }
    public String multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b = scanner.nextInt();
        int result = a * b;
        return "Multiply of given number a: " + a + " and b: " + b + " is: " + result;
    }
    public String division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        double a = scanner.nextInt();
        System.out.println("Please enter value of b: ");
        double b = scanner.nextDouble();
        double result = a / b;
        return "Subtract of given number a: " + a + " and b: " + b + " is: " + result;
    }

    public static void main(String[] args) {
        String choice1="Y";
        while(choice1.equals("Y")){
            System.out.println("Welcome to calculator App.....please enter your choice : 1.Addition, 2.Subtract, 3.Multiply, 4.Division");
            Scanner scanner=new Scanner(System.in);
            int choice= scanner.nextInt();
            CalculatorApp obj=new CalculatorApp();

            if(choice==1){
                System.out.println(obj.addtition());
            } else if (choice==2) {
                System.out.println(obj.subtract());
            } else if (choice==3) {
                System.out.println(obj.multiply());
            } else if (choice==4) {
                System.out.println(obj.division());
            }
            System.out.println("Do you want to continue if yes press 'Y' if not press any other key..");
            Scanner scanner1=new Scanner(System.in);
            choice1=scanner1.nextLine();
        }


    }
}
