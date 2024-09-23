package Revision_package;

public class Nested_If {

    public static void main(String[] args) {


        int num = 50;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
        } else {
            System.out.println("please provide a non negative number");
        }


        // check number even or odd

        int number = -13;
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("first even number");
            } else {
                System.out.println("second odd number");
            }
        } else {
            System.out.println("please provide a non negative number");
        }


    }
}











