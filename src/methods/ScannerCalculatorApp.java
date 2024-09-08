package methods;

import java.util.Scanner;

public class ScannerCalculatorApp {

    public String addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a value of a :");
        int a= scanner.nextInt();
        System.out.println("please enter a value of b :");
        int b=scanner.nextInt();
        int result=a+b;
        return "addition of a: " + a +" and b: "+ b +" is:..>" +result;
    }

    public String substraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a value of a :");
        int a= scanner.nextInt();
        System.out.println("please enter a value of b :");
        int b=scanner.nextInt();
        int result=a-b;
        return "substraction of a: " + a +" and b: "+ b +" is:..>" +result;
    }

    public String multiply(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a value of a :");
        int a= scanner.nextInt();
        System.out.println("please enter a value of b :");
        int b=scanner.nextInt();
        int result=a*b;
        return "multiply of a: " + a +" and b: "+ b +" is:..>" +result;
    }

    public String division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a value of a :");
        double a= scanner.nextDouble();
        System.out.println("please enter a value of b :");
        double b=scanner.nextDouble();
        double result=(double)a/b;
        return "division of a: " + a +" and b: "+ b +" is:..>" +result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose a number for operation in calculator:1.ADDITION, 2.SUBSTRACTION, 3.MULTIPLICATION, 4.DIVISION...");
        int choice = scanner.nextInt();

        ScannerCalculatorApp obj = new ScannerCalculatorApp();
        if(choice==1){
            //call addition
            System.out.println(obj.addition());
        }else if(choice==2){
            //call substraction
            System.out.println(obj.substraction());
        }else if(choice==3){
            //call multiply
            System.out.println(obj.multiply());
        }else if(choice==4){
            //call division
            System.out.println(obj.division());
        }else{
            System.out.println("you have entered invalid number");
        }
    }


}
