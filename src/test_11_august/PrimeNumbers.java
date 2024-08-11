package test_11_august;

public class PrimeNumbers {

    public static void main(String[] args) {

        // write a program to check prime numbers b/w 1 to 20

        int number=20;

        for(int i=1; i<=20; i++){
            int prime=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    prime++;
                }
            }
            if(prime==2){
                System.out.println(i);
            }
        }


    }



}
