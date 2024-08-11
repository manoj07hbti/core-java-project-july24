package assignment;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int number=29;
        if(number >=3 && number<=300){
            if(number %2==0){
            System.out.println("Number is even "+number);
            }else{
                System.out.println("number is odd "+number);
            }

        }



        int fact=5*4*3*2*1;
        System.out.println(
                "Factorial of 5!:" +fact
        );
    }
}
