package test_11_august;

public class StarPattern {

    public static void main(String[] args) {

        // write a program to print

        //   *
        //   **                // row=5
        ///  ***               // column=5
       ////  ****
      /////  *****

      int number=5;
      for(int i=1; i<=5; i++){
          for (int j=1; j<=i; j++){
              System.out.println("*");
          }
          System.out.println();
      }


    }



}
