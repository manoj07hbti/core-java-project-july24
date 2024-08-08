package loop;

public class PracriseClass3 {

    public static void main(String[] args) {

        //1)print number from 1to 10

        //SYNTAX:   for (start_condition; conditional_expression; increment){
//                 //CODE
//              }

        for(int i=1; i<=10; i++){
            System.out.println("NUMBER:"+i);
        }


        //2)print square of numbers between 1 to 30

        for( int i=1; i<=10; i++){
                System.out.println("prime number:"+i*i);
        }

        //3)count down from 10 to 1

        for(int i=10; i>0; i--){
            System.out.println(i);
        }

        //4)print cube of number 1 to 10

        for(int i=1; i<=10; i++){
            System.out.println("cube:"+i +":"+i*i*i);
        }

        //5)print table of 4
         int num=4;
        for(int i=1; i<=10; i++){
            int result=num*i;
            System.out.println(result);

        }

    }
}
