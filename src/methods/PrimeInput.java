package methods;

public class PrimeInput {
    public void Prime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                isPrime=false;
            }
        }
            if (isPrime) {
                System.out.println("Prime Number: " + number);
            } else {
                System.out.println("Non-Prime Number: " + number);
            }
        }


    public static void main(String[] args) {
        PrimeInput prime=new PrimeInput();
        prime.Prime(7);
        prime.Prime(11);
        prime.Prime(15);
        prime.Prime(28);
    }
}