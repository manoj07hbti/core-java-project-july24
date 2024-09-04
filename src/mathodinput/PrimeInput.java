package mathodinput;

public class PrimeInput {

    public void checkprime(int number){
    boolean isPrime = true;
        for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            System.out.println("Number divisible by other number hence it is not prime..." + i);
            isPrime = false;
        }
    }
        if (isPrime) {
        System.out.println("Number is prime..." + number);
    } else {
        System.out.println("Number is not prime..." + number);
    }


}

    public static void main(String[] args) {

        PrimeInput obj=new PrimeInput();
        obj.checkprime(3);
        obj.checkprime(9);
        obj.checkprime(5);

    }



}
