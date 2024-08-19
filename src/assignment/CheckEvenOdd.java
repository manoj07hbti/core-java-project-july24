package assignment;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int number=54;
        if(number >=3 && number<=300){
            if(number %2==0){
            System.out.println("Number is even "+number);
            }else{
                System.out.println("number is odd "+number);
            }

        }else{
            System.out.println("Please provide number between 3 amd 300");

        }



         number=5;
         int factorial = 1;
         for(int i=number;i>0;i--) {
             factorial = factorial * i;


             System.out.println("Factorial of 5:" + i + "" + factorial);
         }

    }
}
