package test_8_sep;

public class Factorial {

    //2)write a code for a factorial

    public String fact(int n){
        String result=" ";
        int factorial =1;
        for(int j=n; j>1; j--){
            factorial=factorial*j;
        }
        result="factorial of "+ n + " is :"+ factorial;
        return result;
    }

    public static void main(String[] args) {

     Factorial obj = new Factorial();
        System.out.println(obj.fact(5));
        System.out.println(obj.fact(10));

    }

}
