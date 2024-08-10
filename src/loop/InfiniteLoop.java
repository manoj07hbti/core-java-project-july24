package loop;

public class InfiniteLoop {

    public static void main(String[] args) {

        //syntax: do{
             //      code
             //      increment/decrement;
            //       }while(condition);

        int i=1;
        do{
            System.out.println("infinite loop:"+i);
            i++;
        }while(i>0);
    }
}
