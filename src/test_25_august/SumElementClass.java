package test_25_august;

public class SumElementClass {

    public static void main(String[] args) {

        int sum[]={1,2,3,4,5};

        int add=0;

        for(int i=0; i<sum.length; i++){

            add+=sum[i]; //uninary method for addition
        }
        System.out.println("sum of all element:"+add);
    }
}
