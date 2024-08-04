package test_4_august;

public class Swap_number {


    public static void main(String[] args) {


        int a = 20;
        int b = 15;
        System.out.println("before swapping a" + a);
        System.out.println("before swapping b" + b);

        a -= b;

        System.out.println("after swapping a" + a);
        System.out.println("after swaping a"+ b);
        b += a;

        System.out.println("after swapping b:" + b);
        System.out.println("after swapping b:" + b);


    }


}


