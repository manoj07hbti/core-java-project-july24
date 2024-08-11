package test_11_august;

public class FactorialNumbers {

    public static void main(String[] args) {

        int i, fact=1;         // 4!= 4*3*2*1=24
        int number=4;

        for( i=1; i<=4; i++){
            fact= fact*i;
        }
        System.out.println("FACTORIAL" +fact);

    }


}
