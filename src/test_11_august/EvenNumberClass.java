package test_11_august;

public class EvenNumberClass {

    public static void main(String[] args) {

        //4)write a code to print even number between 1 to 100

        for(int i=1; i<=100; i++) {
            if (i % 2 == 0) {
                System.out.println("even number:" + i);
            }else{
                System.out.println("odd number:"+ i);
            }
        }
    }
}
