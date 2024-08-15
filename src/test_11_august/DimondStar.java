package test_11_august;

public class DimondStar {

    public static void main(String[] args) {



        // 4. write a program to print

        //*
        //**
        //***
        //**
        //*
        for (int i=1; i<=3; i++) {

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=2; i>=1; i--){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }



    }


}
