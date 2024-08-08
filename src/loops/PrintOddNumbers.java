package loops;

public class PrintOddNumbers {

    public static void main(String[] args) {

        // print odd numbers between 1 to 100

        int number = 100;
        for(int i=1; i<=100; i++){
            if(i%2!=0){
                System.out.println(i + "odd numbers");
            }
        }


    }



}
