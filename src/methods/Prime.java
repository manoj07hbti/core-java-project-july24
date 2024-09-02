package methods;

public class Prime {
    public void prime(){
        boolean isPrime=true;
        int number=11;
        for(int i=2;i<number;i++){
            if(number%i==0){
                System.out.println();
            isPrime=false;
            }

        }
        if (isPrime){
            System.out.println("Prime: "+number);
        }else {
            System.out.println("Not Prime: "+number);
        }

    }

    public static void main(String[] args) {
        Prime p=new Prime();
        p.prime();
    }

}
