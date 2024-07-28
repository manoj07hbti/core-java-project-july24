package variable;

import com.sun.org.apache.regexp.internal.RE;

public class VariableClassRevision {

    public static void main(String[] args) {

        String name="PRIYA";
        System.out.println("Printing name.. "+name);
        String city="AMERICA";
        System.out.println("PRinting city.."+city);
        String number="ENPPK9802K";
        System.out.println("PRinting pan card number..."+number);
        number="462956610135";
        System.out.println("Printing adhar number..."+number);

        int age=98;
        System.out.println("Printing age..."+age);

        double price=65.23;
        System.out.println("Printing price..."+price);

        int x=65;
        int y=32;
        int sum=x+y;
        System.out.println("Addition...."+sum);

        x=23;
        y=32;
        int multi=x*y;
        System.out.println("Multiplication..."+multi);

        x=96;
        y=36;
        int substraction=x-y;
        System.out.println("SUBSTRACTION..."+substraction);

        x=6;
        y=3;
        int divide=x/y;
        System.out.println("DiVIDE..."+divide);

        x=3;
        y=6;
        double div=(double)x/y;
        System.out.println("DIVIDE..."+div);

        int num=987;
        int percnt=25;
        double res=(double)(num*percnt)/100;
        System.out.println("CALCULATE PERCENTAGE..."+res);

        int a=23;
        int square=a*a;
        System.out.println("SQUARE...."+square);

        a=25;
        int cube=a*a*a;
        System.out.println("CUBE..."+cube);

        // INCREEMENT OPERATOR

        int i=1;
        i++;
        System.out.println("PRINTiNG AFTER APPLYING INCREEMENT OPERATOR..."+i);
        i++;
        System.out.println("Printing increement operator..."+i);

        // DECREEMENT OPERATOR

        i=3;
        i--;
        System.out.println("PRinting after apllying decreement operator..."+i);

        //OPERATORS

        // a*=b;  a=a+b;
        // a*=b;  a=a-b;
        // a*=b;  a=a*b;
        // a*=b;  a=a/b;

      int  h=1;
      int  t=2;
      h+=t;
       int r=(h=h+t);
        System.out.println("OPERAtOR..."+r);

        h=3;
        t=2;
        int resu=(h=h-t);
        System.out.println("OPERATOR..... "+resu);

        h=3;
        t=2;
        int resultt=(h=h*t);
        System.out.println("MULTIPLICATION...."+resultt);

        // MODULUS OPERATOR

        int z=5;
        int v=4;
        int mod= z%v;
        System.out.println("MODULUS..."+mod);

        z=81;
        v=9;
        int modu=z%v;
        System.out.println("MODULUS..."+modu);

        // VARIABLE MANIPULATION

        int q=3;
        System.out.println("Printing..."+q);

        q=q+2;
        System.out.println("PRinting..."+q);

        q=q+4;
        System.out.println("Printing..."+q);

        q=q+6;
        System.out.println("PRinting..."+q);

        q=q+8;
        System.out.println("PRINTING..."+q);

        q=q+10;
        System.out.println("Printing..."+q);




    }












}
