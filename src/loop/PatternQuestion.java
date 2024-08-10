package loop;

public class PatternQuestion {

    public static void main(String[] args) {

        //1)PATTERN QUESTION
        // *****
        // *****
        // *****
        // *****

        for(int i=1; i<=4; i++){                  //no.of rows=4

            for(int j=1; j<=5; j++){           //no. of columns=5
                System.out.print("*");
            }
            System.out.println();
        }
        //2)
        //*****
        //*   *
        //*   *
        //*****

        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                if(i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //3)
        //****
        //***
        //**
        //*

        for(int i=4; i>=1; i--){
            for(int j=1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
