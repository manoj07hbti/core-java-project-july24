package methods;

public class Percentage {

    public void percent(){
        int a=107;
        int p=25;
        double result= (double)(a*p)/100;
        System.out.println("PERCENT:"+result);
    }

    public static void main(String[] args) {
        Percentage obj=new Percentage();
        obj.percent();
    }
}
