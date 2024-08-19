package assignment;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=20 ;i++){
            if(i%i==1 ){
                System.out.println("Prime numbers: "+i);
                i++;

            }
        }
    }
}
