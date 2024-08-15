package test_11_august;

public class StarPrint {

    public static void main(String[] args) {

        // 6. write a program print
        //*      //1
        //**     //12
        //***    //123
        //****    //1234
        //*****    //12345
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
