package methodsreturn;

public class PrimeNumber {
    public String Prime(int number){
        boolean isPrime=true;
        for (int i=2;i<number;i++){
            if (number%i==0){
                isPrime=false;
                return "Not Prime: "+number;
            }
        }return "Prime: "+number;
    }

    public static void main(String[] args) {
        PrimeNumber prime=new PrimeNumber();
        String p=prime.Prime(13);
        System.out.println(p);
    }
}
