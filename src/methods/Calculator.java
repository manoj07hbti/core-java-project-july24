package methods;

public class Calculator {

    public void add(){
        int a=60, b=15;
        System.out.println("addition of a and b is: " + (a+b));
    }

    public void substract(){
        int a=60, b=15;
        System.out.println("Subtraction of a and b is: " +(a-b));
    }

    public void product(){
        int a=60, b=15;
        System.out.println("product of a and b is: " +(a*b));
    }

    public void division(){
        int a=60, b=15;
        System.out.println("division of a and b is: " +(a/b));
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add();
        obj.substract();
        obj.product();
        obj.division();

    }



}
