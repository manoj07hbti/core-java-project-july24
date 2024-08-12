package loops;

public class PrimeNumber {

    public static void main(String[] args) {

        for(int number=2; number<=20; number++){

            boolean isPrime=true;
            //int number=12;

            for(int i=2; i<number; i++){

                if(number%i ==0 ){
                    System.out.println("Number is divisible by other number hence not prime ..."+i);
                    isPrime=false;
                }
            }


            if(isPrime){
                System.out.println("******** Number is prime: "+number);
            }else {
                System.out.println("Number is NOT prime: "+number);
            }

        }

        }




}
