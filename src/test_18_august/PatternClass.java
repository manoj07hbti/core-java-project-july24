package test_18_august;

public class PatternClass {

    public static void main(String[] args) {

        //5)write a program to print
        //*
        //**
        //***
        //**
        //*
        //*
        //**
        //***
        //****
        //*****


        for(int n=1; n<=3; n++){
            for(int v=1; v<=n; v++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int n=3; n>=1; n--){
            for(int v=1; v<=n; v++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
