package loops;

public class Assignment1 {

    public static void main(String[] args) {

        //1- table of 5
        int number =5;
        int result;

        for(int i=1; i<=10; i++){
            result = number*i;
            System.out.println(number +" x " +i +" = " +result );
        }

        //2- Print all even number between 1 and 100
        System.out.println("Even numbers between 1 and 100 are:");

        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //3- Print all odd number between 1 and 100
        System.out.println("odd numbers between 1 and 100 are:");

        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }


    }
}
