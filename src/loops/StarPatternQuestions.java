package loops;

public class StarPatternQuestions {

    public static void main(String[] args) {

        // *
        // **
        /// ***
        //// ****

        int n=4;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.println("*" );
            }
            System.out.println();
        }

        // ****
        // ***
        // **
        // *

        int x=4;
        for(int a=4; a>=1; a--){
            for(int b=1; b<=a; b++ ){
                System.out.println("*");
            }
            System.out.println();
        }

        // *****
        // *****
        // *****
        //// *****
        //// *****

        int y=5;
        for(int q=1; q<=5; q++){
            for(int w=1; w<=q; w++){
                System.out.println("hello" );
            }
            System.out.println();
        }

        int u=5;
        for(int d=5; d>=1; d--){
            for(int f=1; f<=d; f++){
                System.out.println("*");
            }
            System.out.println();
        }

        // ******
        // ******           // row=4
       //  ******           // column=6
       //  ******

        int l=4;
        for(int p=1; p<=4; p++){
            for(int o=1; o<=6; o++){
                System.out.println("*");
            }
            System.out.println();
        }



    }



}
