package methods;

public class Calculator {

public void MakeCalculator() {

    int a = 10;
    int b = 5;
    int sum = a + b;
    System.out.println("addition..." + sum);

    int sub = a - b;
    System.out.println("subtraction..." + sub);


    int multi = a * b;
    System.out.println("multiplication..." + multi);

    int divide = a / b;
    System.out.println("division..." + divide);
}

    public static void main(String[] args) {

    Calculator obj3= new Calculator();

    obj3.MakeCalculator();
    }
}
