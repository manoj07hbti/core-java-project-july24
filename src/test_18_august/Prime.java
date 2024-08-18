package test_18_august;

public class Prime {

    public static void main(String[] args) {


        // write a program to check prime numbers 15 to30

      for(int number=2; number <=30; number++){

          boolean isPrime=true;


          for(int i=15; i<=30;i++){

              if(number%i==0) {
                  System.out.println("prime number:"+i);
               for( i=2; i<number;i++){

                   if(number %i==0){
                       System.out.println("given number is divisible by other number is not prime"+i);
                       isPrime = false;
                   }
               }
               if(isPrime){
                   System.out.println("****** number is prime"+ number);
               }else{
                   System.out.println("given number is not prime"+number);
               }


              }



          }




      }





    }





}
