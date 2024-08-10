package loop;

public class NestedLoop {

    public static void main(String[] args) {

        //pattern
        //*
        //**
        //***
        //****

        for(int i=1; i<=4; i++){    //no of rows

            for(int j=1; j<=i; j++){     //no of column

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
