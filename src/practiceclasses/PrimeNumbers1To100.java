package practiceclasses;

public class PrimeNumbers1To100 {

    public static void main(String[] args) {

       for(int number=2; number<=100; number++){
           boolean isPrime=true;

          // int number=3;

           for(int i=2; i<number; i++){
               if(number%i==0){
                   System.out.println("NUMBER IS DIVISIBLE BY OTHER NUMBER HENCE IT IS NOT PRIME."+i);
                   isPrime=false;
               }
           }

           if(isPrime){
               System.out.println("NUMBER IS PRIME.."+number);
           }else{
               System.out.println("NUMBER IS NOT PRIME"+number);
           }
       }
    }







}
