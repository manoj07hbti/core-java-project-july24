package test;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int number=19;
        if(number>=10 && number<=300){
            if (number%2==0){
                System.out.println("Number is even... "+number);
            }else {
                System.out.println("Number is odd... "+number);
            }
            }else {
            System.out.println("Please provide number between 10 and 300");
        }


    }
}
