package mathodinput;

class CalculatorInput {

public void calculator(int a, int b){

    int result=a+b;

    System.out.println("addition is givin number: "+(a+b));


    int sub=a-b;
    System.out.println("subtrition givin number is:"+(a-b));


    int multi=a*b;
    System.out.println("multi givin number is:"+(a*b));

    int divi=a/b;
    System.out.println("divi givin number is:"+(a/b));
}

    public static void main(String[] args) {
        CalculatorInput obj= new CalculatorInput();
        obj.calculator(3,5);
        obj.calculator(5,9);
        obj.calculator(1,4);
    }



}
