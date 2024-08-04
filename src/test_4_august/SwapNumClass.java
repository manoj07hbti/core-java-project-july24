package test_4_august;

public class SwapNumClass {

    public static void main(String[] args) {

        int a=10;
        int b=5;
        System.out.println("before swapping a:"+a);
        System.out.println("before swapping b:"+b);

        a-=b;

        System.out.println("after swapping a:"+a);

        b+=a;

        System.out.println("after swapping b:"+b);
    }
}
