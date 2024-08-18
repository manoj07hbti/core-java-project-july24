package test_18_august;

public class Pattern {
    public static void main(String[] args) {

        //1st  3 lines of pattern
        for(int i=1; i<4; i++){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //next  2 lines of pattern
        for(int i=1; i<3; i++){
            for(int j=3; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // next pattern
        for(int i=1; i<6; i++){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
