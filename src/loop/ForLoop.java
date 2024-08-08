package loop;

public class ForLoop {

    public static void main(String[] args) {

        //SYNTAX:   for (start_condition; conditional_expression; increment){
//                 //CODE
//              }

        // INCREMENT FOR LOOP

        for (int i = 1; i <= 3; i++) {
            System.out.println("hello java:" + i);
        }
        //syntax: for(start condition; conditional expression; increment){
        //code
        //}

        //DECFEMENT FOR LOOP

        for (int i = 3; i >= 1; i--) {
            System.out.println("hello java:" + i);
        }

        //Table of 2

        int num = 2;

        for(int i=1; i<=10; i++){
            System.out.println(num +"*" +i +"=" +num*i);
        }
         //table of 5

        num=5;
        for(int j=1; j<=10; j++){
            System.out.println(num +"*" +j +"=" +num*j);
        }

        //print all even number between 1 to 100

            for (int i = 2; i <= 100; i++) {
                if(i%2==0)
                System.out.println("even number:" + i);
            }

        //print  all odd number between 1 to 100
            for (int j = 1; j <= 100; j++) {
                if (!(j%2 == 0)) {
                    System.out.println("odd number:" + j);
                }
            }
        }
    }
