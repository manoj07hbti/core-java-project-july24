package test_11_august;

public class PrimeNumbersClass {

    public static void main(String[] args) {


        //5)write a program to check prime numbers between 1 to 20

        int num = 10;

        for (int i = 1; i <= 20; i++) {
            if(num%num==0){
                System.out.println("prime number:" + i);
            } else {
                System.out.println("not a prime number:" + i);
            }
        }
    }
}