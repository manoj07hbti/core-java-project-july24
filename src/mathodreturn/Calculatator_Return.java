package mathodreturn;

public class Calculatator_Return {


    // write a code to create calculator

    public int addition(int a, int b) {
        int add = a + b;
        return add;
    }

    public int substraction(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multiplication(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public int division(int a, int b) {
        int divide = a / b;
        return divide;
    }


    public static void main(String[] args) {
        Calculatator_Return obj = new Calculatator_Return();

        int Addition = obj.addition(25, 25);
        System.out.println(Addition);
        int Substraction = obj.substraction(225, 25);
        System.out.println(Substraction);
        int Multiplication = obj.multiplication(25, 25);
        System.out.println(Multiplication);
        int Division = obj.division(25, 5);
        System.out.println(Division);
    }

}

