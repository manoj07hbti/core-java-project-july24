package methods;

public class PrimeNumber {

    public void checkPrime(){

        int num=37;
        boolean is_prime= true;

        for(int i=num-1;i>1;i--){
            if(num % i == 0){
                is_prime = false;
            }
        }

        if(is_prime){
            System.out.println(num + " is a prime number ");
        } else {
            System.out.println(num + " is not a prime number ");
        }


    }

    public static void main(String[] args) {
        PrimeNumber obj  = new PrimeNumber();
        obj.checkPrime();
    }
}
