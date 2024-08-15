package test_11_august;

public class EvenOdd {

    public static void main(String[] args) {
        // 5.even number odd number check

        for (int i = 3; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println("even number  number" + i);
            } else {
                System.out.println("odd number  number" + i);
            }
        }



        //1. write to check even odd number 3 to 300


        for (int j=3; j < 300;j++) {

            if (j %2!=0){

                System.out.println("printing by even number" + j);
            } else {
                System.out.println("odd number print" + j);
            }
        }

    }
}



