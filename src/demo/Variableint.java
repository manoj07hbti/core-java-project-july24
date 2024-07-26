package demo;

public class Variableint {

    public static void main(String[] args) {

        int i=0;

        System.out.println("Value of i : "+i);
        i++; // increment operator
        System.out.println("Value of i after increment: "+i);
        i++;
        System.out.println("Value of i after another increment: "+i);

        i--;
        System.out.println("Value of i after decrement: "+i);
        i--;
        System.out.println("Value of i after another decrement: "+i);

        int a=9;
        int b=3;

        int result= a%b;
        System.out.println("Modulus of a and b is : "+result);
        a=11;
        b=7;
        result=a%b;
        System.out.println("Modulus of a and b is : "+result);

        // Datatype varName= value;
        int x=3;
        int y=4;

        x+=y;// x= x+y ;

        System.out.println("Printing value of X: "+x);

        x*=2; // x=x*2 = 7*2=14

        System.out.println("Printing value of X after x/y : "+x);

        x/=7; // x=x/7 =  14/7 = 2

        System.out.println("Printing after division: "+x);


    }
}
