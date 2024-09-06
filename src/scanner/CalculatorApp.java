package scanner;

import java.util.Scanner;

public class CalculatorApp {

    public String addition(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a=scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b=scanner.nextInt();
        int result=a+b;
        return "Addition of given number a- "+a +" and b- "+b +" is : "+ result;
    }

    // it should ask user what operation you want to perform and based on user choice it will perform anf take input

    public static void main(String[] args) {

        System.out.println("Welcome to calculator App..., Please enter your choice : 1. Addition, 2.Sub, 3, Multi and 4. divide..");
        Scanner scanner= new Scanner(System.in);
        int choice=scanner.nextInt();

        CalculatorApp obj= new CalculatorApp();


        if(choice==1){
            //call addition
            System.out.println(obj.addition());
        } else if(choice==2){
            //call sub
        }else  if(choice==3){
            //call multiply
        }else if(choice==4){
            //call divide
        }
    }
}
