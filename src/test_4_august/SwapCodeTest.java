package test_4_august;

import java.sql.SQLOutput;

public class SwapCodeTest {

    public static void main(String[] args) {

        // write a code to swap two numbers a and b without using any third variable

        int a= 6;
        int b=5;

        System.out.println("printing before swap..."+ a + ":" +b);

        // Mathematical operations

        // a = a+b   6+5=11 // a=11
        // b= a-b    11-5=6 // b=6
        // a = a-b   11-6=5

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("print after swapping...."+a + ":" +b);

        a=15;
        b=16;

        System.out.println("before swapping..."+a + ":" +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping..."+a + ":" +b);

        a=98;
        b=100;
        System.out.println("before swapping... "+a + ":" +b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping..."+a + ":" +b);



    }





}
