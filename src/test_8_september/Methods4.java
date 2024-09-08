package test_8_september;

public class Methods4 {

    public void checkOdd(){
        int no=160;
        for(int i=8;i<=160;i++){
            if(i%11==0){
                System.out.println("odd no.."+no);
            }
        }

    }

    //write a code to check prime number 10 to 20

    // write a code for prime number b/w 10 to 20;

    public boolean checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 10; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;

            }
        }
        return isPrime;


    }

    public static void main(String[] args) {
        Methods4 obj=new Methods4();
        obj.checkOdd();
        boolean isPrime=obj.checkPrime(20);
        System.out.println(isPrime);
        if (isPrime) {
            System.out.println("Number is prime..." );
        } else {
            System.out.println("Number is not prime...");
        }
    }
}


