package methods;

import java.util.Scanner;

public class CalculatorApp {

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
        String re_choice="Y";
        while (re_choice.equals("Y")){
            System.out.println("Welcome to calculator App..., Please enter your choice : 1. Addition, 2.Sub, 3, Multi and 4. divide..");
            Scanner scanner= new Scanner(System.in);
            int choice=scanner.nextInt();

            CalculatorApp obj= new CalculatorApp();

            if(choice==1){
                //call addition
                System.out.println(obj.addition());
            } else if(choice==2){
                //call sub
                System.out.println(obj.substraction());
            }else  if(choice==3){
                //call multiply
                System.out.println(obj.multiply());
            }else if(choice==4){
                //call divide
                System.out.println(obj.division());
            }

            System.out.println("Do you want to continue press Y or press any other button to exit to exit the calculator...");
            Scanner scanner_1= new Scanner(System.in);
            re_choice=scanner_1.nextLine();
        }
    }

}
