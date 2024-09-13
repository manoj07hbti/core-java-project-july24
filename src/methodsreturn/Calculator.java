package methodsreturn;
public class Calculator {
    public int sum(int a,int b){
        int sum=a+b;
        return sum;

    }
    public int subtract(int a, int b){
        int sub=a-b;
        return sub;
    }
    public int multi(int a,int b){
        int multi=a*b;
        return multi;
    }
    public double division(double a,double b){
        double division=a/b;
        return division;
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        int result=c.sum(2,3);
        System.out.println(result);
        result=c.subtract(6,3);
        System.out.println(result);
        result=c.multi(5,9);
        System.out.println(result);
        double div= c.division(9,2);
        System.out.println(div);

    }
}
