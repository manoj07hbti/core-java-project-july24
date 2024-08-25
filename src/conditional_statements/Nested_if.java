package conditional_statements;

public class Nested_if {

    public static void main(String[] args) {

        //example1)--number is greater than zero and divisible by 5
        int num = 30;

        if (num > 0) {
            if (num % 5 == 0) {
                System.out.println("DIVISIBLE BY 5:" + num);
            } else {
                System.out.println("NOT DIVISIBLE BY 5:" + num);
            }
        } else {
            System.out.println("NUMBER IS NOT GREATER THAN 0:" + num);
        }

        num = -2;

        if (num > 0) {
            if (num % 5 == 0) {
                System.out.println("DIVISIBLE BY 5:" + num);
            } else {
                System.out.println("NOT DIVISIBLE BY 5:" + num);
            }
        } else {
            System.out.println("NUMBER IS NOT GREATER THAN 0:" + num);
        }

        //example2)--number is even and divisible by 4

        num=28;

        if(num%2==0) {
            if (num % 4 == 0) {
                System.out.println("NUMBER IS DIVISIBLE BY 4:" + num);
            } else {
                System.out.println("NUMBER IS NOT DIVISIBLE BY 4:" + num);
            }
        }
        else{
            System.out.println("NUMBER IS NOT EVEN:"+num);
        }

        num=50;

        if(num%2==0) {
            if (num % 4 == 0) {
                System.out.println("NUMBER IS DIVISIBLE BY 4:" + num);
            } else {
                System.out.println("NUMBER IS NOT DIVISIBLE BY 4:" + num);
            }
        }
        else{
            System.out.println("NUMBER IS NOT EVEN:"+num);
        }

//example3)--number is greater than 50 and even

        num=78;

        if(num>50) {
            if (num % 2 == 0) {
                System.out.println("NUMBER IS EVEN:" + num);
            } else {
                System.out.println("NUMBER IS NOT EVEN:" + num);
            }
        }
        else{
            System.out.println("NUMBER IS NOT GREATER THAN 50:"+num);
        }

        num=18;

        if(num>50) {
            if (num % 2 == 0) {
                System.out.println("NUMBER IS EVEN:" + num);
            } else {
                System.out.println("NUMBER IS NOT EVEN:" + num);
            }
        }
        else{
            System.out.println("NUMBER IS NOT GREATER THAN 50:"+num);
        }
    }
}

