package test_8_sep;

public class Prime {

    //6)write a code to check prime number between 1 to 10

    public String p(int n) {
        String result=" ";
        for(int i=2; i<10; i++){
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
        Prime obj = new Prime();
        System.out.println(obj.p(5));
        System.out.println(obj.p(2));
        System.out.println(obj.p(6));
    }

}
