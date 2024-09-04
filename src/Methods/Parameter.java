package Methods;

public class Parameter {

// SYNTAX:  access_specifier return_type  method_name (Datatype varName1,Datatype varName2,Datatype varName3..) {
    //                                                                    CODE..   }


    //01 write a method for cube of any number

    public void cube(int i) {

        System.out.println("cube of given number:" + i * i * i);

    }


    //02 write a method to check if given number is prime or not

    public void prime(int num) {

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("number is not prime, divisible by other number:" + i);
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("NUMBER IS PRIME:" + num);
        } else {
            System.out.println("number not prime:" + num);
        }
    }

    //03 write a method for calculator

    public void add(int i, int k) {

        int result = i + k;

        System.out.println("adding given number:" + result);

    }

    public void sub(int i, int k) {

        int result = i - k;
        System.out.println("subtracting given number:" + result);
    }

    public void multi(int x, int y) {
        int result = x * y;
        System.out.println("multiplication of given number:" + result);
    }

    public void div(int y, int x) {

        double result = (double) y / x;
        System.out.println("division of given number:" + result);
    }

    //4) write a methor for factorial

    public void factorial(int num) {

        int factorial = 1;

        for (int i = num; i > 0; i--) {

            factorial = factorial * i;
        }
        System.out.println("factorial of given" + " " + num + "is:" + factorial);
    }

    //05 write a method to calculate percentage

    public void percent(int a, int b) {

        double result = ((double) a / b) * 100;
        System.out.println("percent of given number:" + result);
    }


    public static void main(String[] args) {

        Parameter obj = new Parameter();

        obj.cube(12);
        obj.cube(15);
        obj.cube(22);
        obj.prime(17);
        obj.prime(23);
        obj.prime(26);
        obj.add(7, 4);
        obj.add(15, 14);
        obj.add(25, 17);
        obj.sub(16, 10);
        obj.sub(11, 15);
        obj.sub(23, 12);
        obj.multi(24, 27);
        obj.multi(34, 32);
        obj.multi(33, 25);
        obj.div(14, 13);
        obj.div(16, 22);
        obj.div(19, 40);
        obj.factorial(12);
        obj.factorial(14);
        obj.factorial(25);
        obj.percent(10000, 60);
        obj.percent(7000, 40);
        obj.percent(5000, 25);


    }


}
