package test_11_august;

public class PatternClass {

    public static void main(String[] args) {

        //4)write a program to print
        // *               -------->rows
        // **              .  columns
        // ***             .
        // ****            .
        // *****           .

        //dry run
        //i=1--> j=1--->print * ---> next line---i=2....so on

        for(int i=1; i<=5; i++){    //columns
          for(int j=1; j<=i; j++){    //rows
              System.out.print("*");
          }
            System.out.println();
        }

        //5)write a program to print
        // 1
       //  12
        // 123
     //    1234
     //    12345

        for(int n=1; n<=5; n++){      //columns
            for(int m=1; m<=n; m++){   //rows
                System.out.print(m);
            }
            System.out.println();
        }

        //6)write a program to print
        //*              .
        //**             .     part1
        //***            .
        //**             2     part2
        //*              2

        for(int l=1; l<=3; l++){
            for(int v=1; v<=l; v++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int l=3; l>=1; l--){
            for(int v=1; v<=l; v++){
                System.out.print("*");
            }
            System.out.println();
        }

        //7)write a program tp print
        //-3
        //-2
        //-1
        //0
        //1
        //2
        //3

        for(int q=-3; q<=3; q++){
            System.out.println(q);
        }

    }
}
