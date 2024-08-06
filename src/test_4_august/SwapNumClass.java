package test_4_august;

public class SwapNumClass {

    public static void main(String[] args) {

        //write a code to swap two number ,without using third variable

        int a=10;
        int b=5;
        System.out.println("before swapping->"+ "a:"+ a + " and " + "b:"+ b);

        //mathmatics operations for swapping two number

        //a=a+b;     10+5;
        //b=a-b;     10-5;
        //a=a-b;     10-5;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swapping->"+ "a:"+ a + " and " + "b:"+ b);


    }
}
