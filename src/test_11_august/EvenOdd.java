package test_11_august;

public class EvenOdd {
    public static void main(String[] args) {


        System.out.println("Even Numbers between 3 to 300");
        for(int i=3;i<=300;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }


        System.out.println("Odd Numbers between 3 to 300");
        for(int i=3;i<=300;i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }

    }

}
