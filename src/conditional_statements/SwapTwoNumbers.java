package conditional_statements;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a=321131;
        int b=233333;

        // swap value of these numbers without using third variable

        //a= a+b    3+2=5
        //b= a-b    5-2=3
        //a= a-b    5-3=2

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Value after Swapping...a:" +a +" and b:"+b);




    }


}
