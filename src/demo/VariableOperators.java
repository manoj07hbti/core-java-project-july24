package demo;

public class VariableOperators {

    public static void main(String[] args) {

        int i= 79;
        System.out.println("BEFORE INCREMENT:"+ i);
        i++;                                       //INCREMENT OPERATOR
        System.out.println("AFTER INCREMENT:"+ i);

         i= 51;
        System.out.println("BEFORE DECREMENT:"+ i);
        i--;                                       //DECREMENT OPERATOR
        System.out.println("AFTER DECREMENT:"+ i);

        int a = 70;
        int b = 30;
        a+=b;             //ADDITION OPERATORS
        System.out.println("ADDITION OPERATORS:"+a);

         a = 80;
         b = 50;
         a-=b;             //SUBSTRACTION OPERATORS
         System.out.println("SUBSTRACTION OPERATORS:"+a);

        a = 50;
        b = 20;
        a*=b;             //MULTIPLICATION OPERATORS
        System.out.println("MULTIPLICATION OPERATORS:"+a);

        a = 100;
        b = 10;
        a/=b;             //MULTIPLICATION OPERATORS
        System.out.println("MULTIPLICATION OPERATORS:"+a);

        a=789;
        b=7;
        a%=b;
        System.out.println("MODULUS OPERATORS:"+a);








    }
}
