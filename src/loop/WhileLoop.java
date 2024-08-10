package loop;

public class WhileLoop {

    public static void main(String[] args) {

        //SYNTAX : SYNTAX:  while (condition){
        //                                   //code
        //			                  increment/decrement;
        //                         }

        //table of 5

        int num = 5;
        int i = 1;

        while (i <= 10) {
            System.out.println(num + "*" + i + "=" + (num * i));
            i++;
        }

        //table of 10

        num = 10;
        i = 1;

        while (i <= 10) {
            System.out.println(num + "*" + i + "=" + (num * i));
            i++;
        }

        //print all even number between 1 to 100

        num = 2;
        while (num <= 100) {
            if (num % 2 == 0)
                System.out.println("even number:" + num);
            num++;
        }

        //print all odd number between 1 to 100

        num =1;
        while (num <= 100) {
            if (!(num % 2 == 0))
                System.out.println("odd number:" + num);
            num++;
        }
    }
}