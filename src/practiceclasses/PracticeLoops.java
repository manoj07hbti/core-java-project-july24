package practiceclasses;

public class PracticeLoops {

    public static void main(String[] args) {

        //  print square of numbers between 1 to 30.

        for(int i=1; i<=30; i++){
            System.out.println("square" +i*i);
        }

        // print cube of numbers between 1 to 30.

        for(int j=1; j<=30; j++){
            System.out.println("CUBE" +j*j*j);
        }

        // print table of 3.
        int number=3;
        int result;

        for(int x=1; x<=10; x++){
            result=number*x;
            System.out.println("3" + "*" +x + "=" +(result));
        }

        // print table of 8.

        number=8;
        for( int y=1; y<=10; y++){
            result= number*y;
            System.out.println("8" + "*" +y +"=" + (result));

        }

        // print of table of 15.

        number=15;

        for( int a=1; a<=10; a++){
            result=number*a;
            System.out.println("15" + "*" +a +"=" +(result));
        }

        // print number reverse 10 to 1

        for( int b=10; b>0; b--){
            System.out.println("Reverse..."+b);
        }

        // print even number between 1 to 100.

        int n= 100;
        for(int d=1; d<=100; d++){
            if(d%2==0){
                System.out.println("EVEN NUMBERs.. "+d);
            }

            // print odd numbers between 1 to 100.

            for( int f=1; f<=100; f++){
                if(f%2!=0){
                    System.out.println("ODD NUMBERS.."+f);
                }

            }
        }


    }







}
