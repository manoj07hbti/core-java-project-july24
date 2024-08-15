package test_11_august;

public class FactorialNumber {

    public static void main(String[] args) {
//2  factorial of 4 will be 4*3*2*1=24
        int i, fact = 1;
        int number = 4;
        for (i = 1; i <= 4; i++) {
            fact = fact * i;
        }
        System.out.println("factoril" + fact);


    }
}