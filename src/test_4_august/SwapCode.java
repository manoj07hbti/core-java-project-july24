package test_4_august;

public class SwapCode {

    public static void main(String[] args) {

        int x= 38;
        int y=37;

        System.out.println("befpre swapping.. "+x + ":"+y);

       // x= x+y = 38+ 37 = 75;
       // y= x-y = 38 - 37 = 1;
       // x= x-y = 38-37 = 1;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("AFTER SWAPPING.... "+x + ":" +y);




    }




}
