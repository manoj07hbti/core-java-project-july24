package test_18_august;

public class EvenOddClass {

    public static void main(String[] args) {

        //1)write a program for even number between 300 to 10

        for(int i=300; i>=10; i--)
            if(i%2==0){
                System.out.println("even number"+i);
            }else
            {
                System.out.println("odd number:"+i);
            }
    }
}
