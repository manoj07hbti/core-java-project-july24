package test_11_august;

public class Loops {
    public static void main(String[] args) {

        //1
        for(int i=-3;i<=3;i++){
            System.out.println(i);
        }

        //2-check prime number;
        System.out.println();
        int number = 29;
        boolean isprime= true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isprime= false;
            }
        }

        if(isprime){
            System.out.println(number + " is a  prime number");
        }else {
            System.out.println(number + " is not a prime number");
        }

        //3- pattern
        System.out.println();
        for(int i=1; i<=5; i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for (int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //4- pattern
        System.out.println();

        for(int i=1;i<=3;i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i>=1; i--){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
