package test_18august;

public class SwapNumbers {

    public static void main(String[] args) {

        // write a code to swap two numbers a and b without using third varibale


        int a = 75;
        int b = 76;

        System.out.println("Printing before swap...");

        // a= a+b // 75+76=151
        // b=a-b // 151-76=75
        // a= a-b // 151-75=76

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping " + a + ":" + b);


    }


}
