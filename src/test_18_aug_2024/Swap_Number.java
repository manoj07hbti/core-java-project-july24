package test_18_aug_2024;

public class Swap_Number {
    public static void main(String[] args) {

        //swap two number without using third variables:
        int a = 30;

        int b = 20;

        System.out.println("before swaping");

        System.out.println("A " + a + " and B : " + b);

        a = a + b; //a : 30+20 =50

        b = a - b; //b : 50-20 =30

        a = a - b; //a :50-10 =40

        System.out.println("After swaping");
        System.out.println(" A : " + a + " and B : " + b);


    }
}
