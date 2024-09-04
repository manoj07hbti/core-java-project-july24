package methods;

public class CalculatorInput {
    public void add(int a, int b){
        System.out.println("Add: "+(a+b));
    }
    public void Subtract(int a, int b){
        System.out.println("Subtract: "+(a-b));
    }
    public void Multiply(int a, int b){
        System.out.println("Multiply: "+(a*b));
    }
    public void Division(double a, double b){
        System.out.println("Division: "+(a/b));
    }

    public static void main(String[] args) {
        CalculatorInput calculator=new CalculatorInput();
        calculator.add(5,7);
        calculator.Subtract(958,554);
        calculator.Multiply(59,49);
        calculator.Division(9587,15);
    }
}
