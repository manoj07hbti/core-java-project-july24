package test_18_august;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 45, b = 25;

        System.out.println("Values of a and b before swap are: " + a + " and " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values of a and b after swap are: " + a + " and " + b);

        }

    }

