package methods;

public class Method1 {

    // prime number 1 to 20

    public void checkPrime() {
        for (int number = 1; number <= 20; number++) {
            boolean isPrime = true;
            //int number=20;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Number divisible by other number hence it is not prime..." + i);
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Number is prime..." + number);
            } else {
                System.out.println("Number is not prime..." + number);
            }
        }
    }


    // create calculator // add sub multi divide

    public void createCalculator() {
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Addition..." + sum);

        int sub = a - b;
        System.out.println("Substraction.." + sub);

        int multi = a * b;
        System.out.println("Multiplication..." + multi);

        int divide = a / b;
        System.out.println("Division...." + divide);
    }

    // check division of student who is having 6 subect

    public void checkDivision() {

        double sub1marks = 60;
        double sub2marks = 65;
        double sub3marks = 70;
        double sub4marks = 82;
        double sub5marks = 80;
        double sub6marks = 70;
        double marksobtained = 427;
        double percentage = ((double) 427 / 600) * 100;
        System.out.println("Printing markss...." + percentage);
        if (percentage >= 60 && percentage <= 70) {
            System.out.println("Printing third division...");
        } else if (percentage >= 70 && percentage <= 80) {
            System.out.println("Printing second division");
        } else if (percentage >= 80 && percentage <= 85) {
            System.out.println("printing first division");
        } else {
            System.out.println("Failed in exam");
        }
    }

    public static void main(String[] args) {
        Method1 obj = new Method1();
        obj.checkPrime();
        obj.createCalculator();
        obj.checkDivision();
    }


}
