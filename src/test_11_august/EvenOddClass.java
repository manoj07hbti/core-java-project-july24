package test_11_august;

public class EvenOddClass {


    public static void main(String[] args) {

        //1)write a code to check even and odd number between 3 to 300

        for(int m=3; m<=300; m++){
            if (m % 2 == 0) {
                System.out.println("even number:" + m);
            } else {
                System.out.println("odd number:" + m);
            }

        }


        //2nd method----> if random number checked
        //1)write a code to check even and odd number between 3 to 300

           int i=78;
            if (i % 2 == 0) {
                System.out.println("even number:" + i);
            } else {
                System.out.println("odd number:" + i);
        }
    }
}
