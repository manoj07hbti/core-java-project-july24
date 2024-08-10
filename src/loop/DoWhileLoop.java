package loop;

public class DoWhileLoop {

    public static void main(String[] args) {

        //SYNTAX:      do {
        //                   CODE
        //                  increment/decrement;
        //                } while(condition);


        //table of 6

        int i=1;
        int num=6;
        do{
            System.out.println(num+"*"+i+"="+(num*i));
            i++;
        }while(i<=10);

        //print all even number between 1 to 100

        num=2;
        do{
            if(num%2==0)
            System.out.println("even number:"+ num);
            num++;
        }while(num<=100);


        //print all odd number between 1 to 100

        num=1;
        do{
            if(!(num%2==0))
            System.out.println("odd number:"+num);
        num++;
        }while(num<=100);
    }
}
