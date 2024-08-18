package test_18_august;

public class PrimeCheck {
    public static void main(String[] args) {

        for(int num=15; num<=30; num++){

            boolean isprime= true;

            for(int i=num-1; i>1; i-- ){
                if(num%i == 0){
                    isprime =false;
                }

            }

            if(isprime){
                System.out.println(num +" is a prime number ");
            } else{
                System.out.println(num +" is not a prime number ");
            }



        }


    }
}
