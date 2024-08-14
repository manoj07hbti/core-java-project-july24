package practiceclasses;

public class PrimeNumber1To50 {

    public static void main(String[] args) {

        for(int number=1; number<=50; number++){
            boolean isPrime=true;

          //  int number=49;

            for(int i=2; i<number;i++){
                if(number%i==0){
                    System.out.println("NUMBER DIVISIBLE BY OTHER NUMBER hence it is NOT PRIME.."+i);
                    isPrime=false;
                }
            }

            if(isPrime){
                System.out.println("NUMBER is PRIME..."+number);
            } else{
                System.out.println("NUMBEr IS NOT PRIME..."+number);
            }
        }



    }



}
