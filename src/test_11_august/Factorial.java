package test_11_august;

public class Factorial {

    public static void main(String[] args) {

        int num=4;
        int result =1;

        for(int i=num; i>0;i--){
            result=result*i;
        }

        System.out.println("factorial of "+num+" is "+result);

    }
}
