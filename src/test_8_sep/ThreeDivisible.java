package test_8_sep;

public class ThreeDivisible {

    //1)write a code to check any number between 5 to 150 ,
    // which is divisible by 3 and it should not be even number

    public String three(int n){
        String result =" ";
        for(int i=5; i<=150; i++){
          if(!(n%2==0)){
              if(n%3==0){
                  result="divisible by 3:"+n;
              }else{
                  result="not divisible by 3:"+n;
              }
          }else{
              result="number is even:"+n;
          }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeDivisible obj = new ThreeDivisible();
        System.out.println(obj.three(10));
        System.out.println(obj.three(15));

    }

}
