package methods;

public class Method_Input {

    //SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    // CREATE CUBE

    public void createcube(int number) {
        System.out.println("CUBE..." + number * number * number);
    }

    // CHECK PERCENTAGE

    public void CheckPercentage(double number, double percentage) {

        double result = (number * percentage) / 100;
        System.out.println("PERCENTAGE..." + result);
    }

    // CREATE CALCULATOR

    public void CreateCalculator(int a, int b) {

        int add = a + b;
        System.out.println("Addition..." + add);

        int sub = a - b;
        System.out.println("Subtraction...:" + sub);

        int multi = a * b;
        System.out.println("Multiplication...:" + multi);

        int divide = a / b;
        System.out.println("Division...:" + divide);
    }

    public static void main(String[] args) {

        // create Object using default constructor

        Method_Input obj1= new Method_Input();

        // obj.methodName(value1,value2,value3)

        obj1.createcube(6);
        obj1.createcube(8);
        obj1.createcube(10);
        obj1.CheckPercentage(500,10);
        obj1.CheckPercentage(600,63);
        obj1.CheckPercentage(500,51);
        obj1.CreateCalculator(23,50);
        obj1.CreateCalculator(100,100);
        obj1.CreateCalculator(25,50);

    }

}
