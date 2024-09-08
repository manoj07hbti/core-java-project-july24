package test_8_september;

public class Test {

    //1
    public void checkNumbers() {
        for (int i = 5; i <= 150; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //2
    public  int findFactorial(int n) {
        int factorial = 1;  // Initialize factorial to 1

        for (int i = 1; i <= n; i++) {
            factorial *= i;  // Multiply factorial by current value of i
        }

        return factorial;
    }

    //3
    public void checkDivisibility7() {
        for (int i = 7; i <= 190; i++) {
            if (i % 7 == 0 && i % 2 == 0) {  // Divisible by 7 and not odd (even)
                System.out.println(i + " is divisible by 7 and is not odd.");
            }
        }
    }

    //4
    public static void printSquares() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square of " + i + " is: " + (i * i));
        }
    }

    //5
    public  void checkDivisibility9() {
        for (int i = 3; i <= 160; i++) {
            if (i % 9 == 0 && i % 2 == 0) {  // Divisible by 9 and even (not odd)
                System.out.println(i + " is divisible by 9 and is not odd.");
            }
        }
    }

    //6
    public  void printCubes() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Cube of " + i + " is: " + (i * i * i));
        }
    }

    //7
    public void checkDivisibility11() {
        for (int i = 8; i <= 160; i++) {
            if (i % 11 == 0 && i % 2 == 0) {  // Divisible by 11 and even (not odd)
                System.out.println(i + " is divisible by 11 and is not odd.");
            }
        }
    }

    //8 & 10
    public void checkPrime(int num){
        boolean is_prime= true;

        for(int i=num-1;i>1;i--){
            if(num % i == 0){
                is_prime = false;
            }
        }

        if(is_prime){
            System.out.println(num + " is a prime number ");
        } else {
            System.out.println(num + " is not a prime number ");
        }


    }

    //9
    public void checkDivisibility_11() {
        for (int i = 180; i >= 1; i--) {
            if (i % 11 == 0 && i % 2 == 0) {  // Divisible by 11 and even
                System.out.println(i + " is divisible by 11 and is not odd.");
            }
        }
    }

    public static void main(String[] args) {
        Test obj = new Test();

        obj.checkNumbers();
        System.out.println();

        int number = 5;  // Example number
        int result = obj.findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        System.out.println();


        obj.checkDivisibility7();
        System.out.println();

        obj.printSquares();
        System.out.println();

        obj.checkDivisibility9();
        System.out.println();

        obj.printCubes();
        System.out.println();

        obj.checkDivisibility11();
        System.out.println();

        System.out.println("Prime numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
           obj.checkPrime(i);
        }
        System.out.println();

        obj.checkDivisibility_11();
        System.out.println();

        System.out.println("Prime numbers between 10 and 20:");
        for (int i = 10; i <= 20; i++) {
            obj.checkPrime(i);
        }
        System.out.println();


    }

}
