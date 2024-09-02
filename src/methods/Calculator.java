package methods;

public class Calculator {
    //add a and b

    public void add(int a, int b){

        int result=a+b;
        System.out.println("Addition of given number is: "+ (a+b));

    }

    //sub
    //multi
    // division
    public static void main(String[] args) {

        Calculator obj= new Calculator();
        obj.add(3,4);
        obj.add(255252,72);
        obj.add(2112,43342);
    }


}
