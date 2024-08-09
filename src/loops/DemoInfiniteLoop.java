package loops;

public class DemoInfiniteLoop {

    public static void main(String[] args) {
/*
        for(int i=1; i>0; i++){

            System.out.println("For Loop..."+i);
        }
     */
       int i=1;
     /*    while (i>0){

            System.out.println("While Loop..."+i);
            i++;
        }*/

        do{
            System.out.println("Do While Loop..."+i);
            i++;
        }while (i>0);

    }



}
