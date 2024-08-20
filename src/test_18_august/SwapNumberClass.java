package test_18_august;

public class SwapNumberClass {

    public static void main(String[] args) {

        //2) write a program to swap a numbers without using third variable

        int q=8;
        int r=10;
        System.out.println("BEFORE SWAPPING:"+"q"+":"+"r"+"...>"+q+":"+r);

        q=q+r;     //q=8+10=18;
        r=q-r;      //r=18-10=8;
        q=q-r;      //q=18-8=10;

        System.out.println("AFTER SWAPPING:"+"q"+":"+"r"+"...>"+q+":"+r);


    }
}
