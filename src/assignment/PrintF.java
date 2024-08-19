package assignment;

public class PrintF {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {


            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println("\n");


        }

        for (int x = 1; x <= 5; x++) {

            for (int y = 1; y <= x; y++) {

                System.out.print(y);
            }
            System.out.println("\n");

        }

        for (int g = 1; g <= 3; g++) {

            for (int h = 1; h <= g; h++) {

                System.out.print("*");
            }
            System.out.println("\n");
        }
        for (int x =2; x >= 1; x--) {

            for (int y = 1; y <= x; y++) {

                System.out.print("*");
            }
            System.out.println("\n");

        }
    }
}
