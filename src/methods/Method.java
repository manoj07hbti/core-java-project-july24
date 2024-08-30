package methods;

public class Method {
    // create square

    // Syntax: access specifier returntype methodname(parameter){code}

    public void makeSquare() {
        int number = 6;
        System.out.println("Printing square by using method..." + number * number);
    }

    // create cube

    public void makeCube() {
        int num = 3;
        System.out.println("Printing cube  by using method..." + num * num * num);
    }

    // voting eligibility
    public void checkVoting() {
        int age = 20;
        if (age > 18) {
            System.out.println("Eligible for voting...");
        } else {
            System.out.println("Not eligible for voting");
        }
    }

    // create even and odd 1 to 100
    public void makeEvenOdd() {
        int numbers = 100;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Printing even numbers..." + i);
            } else {
                System.out.println("Odd numbers...");
            }
        }


    }

    public void calculatePercentage() {
        int n = 300;
        double percent = 5;
        double result = (n * percent) / 100;
        System.out.println("Printing percentage by  using method..." + result);
    }

    public static void main(String[] args) {
        Method obj = new Method();
        obj.makeSquare();
        obj.makeCube();
        obj.checkVoting();
        obj.makeEvenOdd();
        obj.calculatePercentage();

    }


}
