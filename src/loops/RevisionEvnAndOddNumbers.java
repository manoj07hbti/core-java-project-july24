package loops;

public class RevisionEvnAndOddNumbers {

    public static void main(String[] args) {


        // print even numbers 1 to 1000

        int number = 1000;

        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
        }

        // print odd numbers 1 to 1000

        number=1000;
        for(int j=1; j<=1000; j++){
            if(j%2!=0){
                System.out.println(j + "");
            }
        }

    }



}
