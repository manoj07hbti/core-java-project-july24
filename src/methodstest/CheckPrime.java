package methodstest;

public class CheckPrime {
    public String Prime(int number) {
        boolean isPrime = true;
        if (number >= 1 && number <= 10) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;

                    System.out.println("Not Prime: " + number);
                    break;
                }else{
                    System.out.println("Prime: " + number);
                    break;
                }

            }
        }else {
            System.out.println("Invalid Number");
        }return "";
    }

    public String prime(int number) {
        boolean isPrime = true;
        if (number >= 10 && number <= 20) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    System.out.println("Not Prime: " + number);
                    break;
                }
                System.out.println("Prime: " + number);
                break;
            }
        }else {
            System.out.println("Invalid Number");
        }return "";
    }


    public static void main(String[] args) {
        CheckPrime prime = new CheckPrime();
        String p = prime.Prime(8);
        System.out.println(p);
        String p2 = prime.prime(13);
        System.out.println(p2);
    }
}
