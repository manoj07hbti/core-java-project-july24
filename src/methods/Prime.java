package methods;

public class Prime {

    public void p() {

        for (int number = 2; number <= 30; number++) {
            boolean isPrime = true;

            for (int i = 2; i <number; i++) {
                if (number % i == 0) {
                    System.out.println("not prime because it is divisible by other number:" + i);
                    isPrime = false;
                }
            }

               if(isPrime){
                   System.out.println("***number is prime:"+number);
               }
               else{
                   System.out.println("number is not prime:"+number);
               }
            }
        }
    public static void main(String[] args) {
       Prime obj=new Prime();
       obj.p();
    }
}
