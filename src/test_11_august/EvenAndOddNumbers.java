package test_11_august;

public class EvenAndOddNumbers {

    public static void main(String[] args) {

        // write a code to check even and odd number b/w 3 to 300

        int number=300;

        for(int i=3; i<=300; i++){
            if(i%2==0){
                System.out.println("EVEN NUMBERS.."+i);
            }
        }


        number=300;

        for(int j=3; j<=300; j++){
            if(j%2!=0){
                System.out.println("ODD NUMBERS..."+j);
            }
        }


    }




}
