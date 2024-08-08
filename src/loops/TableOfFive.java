package loops;

public class TableOfFive {

    public static void main(String[] args) {

        // print table of 5

        int number=5;
        int result;


        for(int i=1; i<=10; i++){

            result=number*i;

            System.out.println("5" + "*" + i + "=" +(result));

            // print table of 10

            number=10;

            for(int x=1; x<=10; x++){
                result=number*x;
                System.out.println("10" + "*" +  x+ "=" +(result));
            }

        }


    }


}
