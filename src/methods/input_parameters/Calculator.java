package methods.input_parameters;

public class Calculator {

    public void add(int a, int b){
        System.out.println("addition of a and b is: " + (a+b));
    }

    public void substract(int a, int b){
        System.out.println("Subtraction of a and b is: " +(a-b));
    }

    public void product(int a, int b){
        System.out.println("product of a and b is: " +(a*b));
    }

    public void division(int a, int b){
        double result = (double) a/b;
        System.out.println("division of a and b is: " +result);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(7,8);
        obj.substract(10,2);
        obj.product(5,3);
        obj.division(15,7);

    }


}
