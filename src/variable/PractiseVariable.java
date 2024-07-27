package variable;

public class PractiseVariable {

    public static void main(String[] args) {

        //manupulation

        int x=23;
        System.out.println("BEFORE MANUPULATION:"+ x);

        x=x+2;
        System.out.println("ADDITION MANUPULATION :"+x);

        x=x-20;
        System.out.println("SUBSTRACTION MANUPULATION:"+x);

        x=x*10;
        System.out.println("MULTIPILCATION USING MANUPULATION:"+x);

       int a=100;
       int b =3;
       double v=(double)a/b;
        System.out.println("DIVISION MANUPULATION:"+v);

        a=357;
        b=8;
        v= (double)a%b;
        System.out.println("MODULUE MANUPULATION:"+v);

        //operation

        x=50;
        System.out.println("BEFORE INCREMENT:"+x);
        x++;
        System.out.println("AFTER INCREMENT:"+x);

        x=41;
        System.out.println("BEFORE DECREMENT:"+x);
        x--;
        System.out.println("AFTER DECREMENT:"+x);

        //uniary operator

        int s=23;
        int j=37;
        s+=j;
        System.out.println("ADDITION UNIARY OPERETOR:"+s);

         s=23;
         j=37;
        s-=j;
        System.out.println("SUBSTRACTION UNIARY OPERETOR:"+s);

        s=23;
        j=37;
        s*=j;
        System.out.println("MULTIPLICATION UNIARY OPERETOR:"+s);

        int k=356;
        int c=3;
        double w=(double)k/c;
        System.out.println("DIVISION UNIARY OPERETOR:"+w);

        s=237;
        j=37;
        s%=j;
        System.out.println("ADDITION UNIARY OPERETOR:"+s);

    }
}
