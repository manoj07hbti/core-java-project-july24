package test_4_august;

public class Swap {

    public static void main(String[] args) {

        //swap two number without using third variables:
        int a =10;

        int b = 20;

        System.out.println("before swaping");
        System.out.println("A " +a+" and B : " +b);

        a = a+b; //a : 10+20 =30

        b =a-b; //b : 30-20 =10

        a =a-b; //a :30-10 =20

        System.out.println("After swaping");
        System.out.println(" A : " +a + " and B : " +b);

    }
}
