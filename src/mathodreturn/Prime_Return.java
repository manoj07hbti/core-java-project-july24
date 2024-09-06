package mathodreturn;

public class Prime_Return {

    // write a code to check prime numbers

    public boolean checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Prime_Return obj = new Prime_Return();

        boolean isPrime = obj.checkPrime(37);
        System.out.println(isPrime);
        if (isPrime) {
            System.out.println("Number is  prime ");
        } else {
            System.out.println("not a prime number");
        }

    }
}