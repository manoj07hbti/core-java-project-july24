package test_2024;


public class Test_28_2024 {

    public static void main(String[] args) {

        //1)pattern

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

       //2)print to remainder of any two number
        int x=34;
        int y=3;
        int remainder=x%y;
        System.out.println("REMAINDER OF A & B:"+remainder);

        //3)print increment values of x & y
        x=56;
        y=79;
        System.out.println("BEFORE INCREMENT VALUE OF X AND Y:"+ x + ":" + y);
        x++;
        y++;
        System.out.println("AFTER INCREMENT VALUE OF X AND Y :"+ x + ":" + y);

        //4)print decrement values of i & j
               int i=61;
               int j=71;
                System.out.println("BEFORE DECREMENT VALUE OF i AND j:"+ i + ":" + j);
                i--;
                j--;
                System.out.println("AFTER DECREMENT VALUE OF i AND j :"+ i + ":" + j);

          //5)code of calc
        //addition of x & y
        x=50;
        y=20;
        int sum= x+y;
        System.out.println("ADDITION OF X AND Y :"+ sum);

        //substraction of x and y

        x=20;
        y=10;
        int sub = x-y;
        System.out.println("SUBSTRACTION OF X AND Y :"+ sub);

        x=50;
        y=2;
        int multi = x*y;
        System.out.println("MULTIPLICATION OF X AND Y :"+ multi);

        x=300;
        y=2;
        int divide=x/y;
        System.out.println("DIVISION OF X AND Y :"+ divide);

        //6) adhaar card number ,name, city of candidate

        String name="PRIYANKA";
        String city="INDORE";
      long mynum = 222233334444L;
        System.out.println("NAME:"+name +" : "+"CITY:"+city + " : "+ "ADHAAR:"+mynum);

        //7)find 7% of 3562231111123 number

        long w=35632231111123L;
        int s=7;
        double percent=(double)(w*s)/100;
        System.out.println("7% OF 35632231111123:"+ percent);


    }
}
