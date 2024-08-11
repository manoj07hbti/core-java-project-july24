package loops;

public class Assignment2 {
    public static void main(String[] args) {

        //1- star pattern
        for(int i=0; i<=3; i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2- table of 10 using for and while loop

        int number =10;
        int result;

        for(int i=1; i<=10; i++){
            result = number*i;
            System.out.println(number +" x " +i +" = " +result );
        }

        int i=1;
        while(i<=10){
            result = number*i;
            System.out.println(number +" x " +i +" = " +result );
            i++;
        }

        //3- even numbers between 1 and 100
        System.out.println("Even numbers between 1 and 100 are");
        i=1;
        while (i<=100){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }

        //4- odd numbers between 1 and 100
        System.out.println("Odd numbers between 1 and 100 are");
        i=1;
        while (i<=100){
            if(i%2 != 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
