package methods;

public class Primenumber {



    public void checkPrime() {
        for (int number = 1; number <= 20; number++) {
            boolean isPrime = true;
            //int number=20;
            for (int i = 1; i < number; i++) {
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
    }

    public static void main(String[] args) {
        Primenumber obj=new Primenumber();
        obj.checkPrime();
    }

}
