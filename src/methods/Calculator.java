package methods;

public class Calculator {

    public void add(){

        int a=3;
        a=a+10;

        System.out.println("ADD:"+a);
    }

    public void sub(){
        int b=10;
        b=b-5;
        System.out.println("SUBSTRACT:"+b);
    }

    public void multi(){
        int c=10;
        c=c*10;
        System.out.println("MULTIPLICATION:"+c);
    }

    public void div(){
        int d=100;
        int e=5;
        double result=(double)(d*e);
        System.out.println("DIVISON:"+result);
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.add();
        obj.sub();
        obj.multi();
        obj.div();
    }
}
