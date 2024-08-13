package test_11_august;

public class FactorialClass {


    public static void main(String[] args) {

        //factorial example: !3=3*2*1=6
        //                   !4=4*3*2*1=24


        //3)write a code to make factorial

        int n=4;
        int factorial=1;

        for(int i=n; i>0; i--) {

            factorial = factorial * i;
        }
            System.out.println(factorial);

    }
}
