package assignment;

public class NestedIF {
    public static void main(String[] args) {
        double i=-12;
        if(i>0){
            if(i%5==0){
            System.out.println("Divisible");
        }else {
            System.out.println("Not Divisible");
        }

        }else {
            System.out.println("Provide a non negative number");
        }

    int number=15;
        if(number>0){
            if(number%2==0){
                System.out.println("Even Number: "+number);
            }else {
                System.out.println("Odd Number: "+number);
            }
        }else {
            System.out.println("Provide a non negative number");
        }
    }
}
