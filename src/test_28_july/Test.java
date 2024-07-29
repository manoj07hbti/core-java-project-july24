package test_28_july;

public class Test {

    public static void main(String[] args) {

        //1
        long aadhaarnum = 893140648445L;
        String name= "Anshul Singh";
        String city= "Agra";

        System.out.println("Name - "+name +" Aadhaar number- " +aadhaarnum + " city- " +city);

        //2
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        //3
        long num =  35632231111123L;

        double result = (double) (num*7)/100;
        System.out.println("7% of " +num + " is: " +result);

        //4
        int x=8, y=3;

        System.out.println("Remainder of " +x +  " and "  +y +" is : " +x%y);

        //5
        x= 45;
        y =66;
        System.out.println("Value of x before increment is: " +x);
        System.out.println("Value of y before increment is: " +y);

        x++;
        y++;

        System.out.println("Value of x after increment is: " +x);
        System.out.println("Value of y after increment is: " +y);


        //6
        int i= 10;
        int j= 20;
        System.out.println("Value of i before decrement is: " +i);
        System.out.println("Value of j before decrement is: " +j);

        i--;
        j--;
        System.out.println("Value of i after decrement is: " +i);
        System.out.println("Value of j after decrement is: " +j);

        //7
         x=10;
         y=4;

        int add= x+y;
        int sub= x-y;
        int mul= x*y;
        double div= (double) x/y;

        System.out.println("Addition of x and y: " +add);
        System.out.println("Subtraction of x and y: " +sub);
        System.out.println("Product  of x and y: " +mul);
        System.out.println("Division of x and y: " +div);









    }

}
