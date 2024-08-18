package test_11_august;

public class Print_program {


    public static void main(String[] args) {



        int number=3;
        for(int i=1; i<=3; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println ();
        }
        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }

}
