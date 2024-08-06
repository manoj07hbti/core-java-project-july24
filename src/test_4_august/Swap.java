package test_4_august;

public class Swap {

    public static void main(String[] args) {
// write a code to swapping two number a and b without using third variabls
        int a = 10;
        int b = 5;
        System.out.println("befor swapping.." + a + "" + b);

        //   a=a+b=    10+5=15;
        // b=a-b=      15-5=10;
        // a=a-b=      15-10=5;

        a = a + b;
        b = a - b;
        a=  a -b;
        System.out.println("after swapping...a;" + a + "and b;" + b);

    }
}