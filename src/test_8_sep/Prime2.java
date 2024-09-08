package test_8_sep;

public class Prime2 {


    //9)write a code to check any number between 10 to 20

    public String pri(int n){
            String result=" ";
            for(int i=10; i<20; i++){
                boolean isprime =true;
                for(int j=2; j<n; j++){
                    if(n%2==0){
                        result="not a prime bcz, divisible by other:"+j;
                        isprime=false;
                    }
                }
                if(isprime){
                    result="NUMBER IS PRIME:"+n;
                }else{
                    result="number is not prime:"+n;
                }
            }
            return result;
    }

    public static void main(String[] args) {
        Prime2 obj = new Prime2();
        System.out.println(obj.pri(17));
        System.out.println(obj.pri(14));
    }
}
