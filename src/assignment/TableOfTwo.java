package assignment;

public class TableOfTwo {
    public static void main(String[] args) {
        int number=2;
        int result;
        for(int i=1;i<=10; i++ ){
            result=number * i;
            System.out.println("2"+"*"+i+"="+result);
        }
         number=5;
        for(int i=1;i<=10; i++ ){
            result=number * i;
            System.out.println("5"+"*"+i+"="+result);
        }
        number=10;
        for(int i=1;i<=10; i++ ){
            result=number * i;
            System.out.println("10"+"*"+i+"="+result);
        }


    }
}
