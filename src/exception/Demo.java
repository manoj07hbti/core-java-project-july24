package exception;

public class Demo {



    public int divide(int a, int b){

        System.out.println("BEFORE calculation");
        int result=0;
        try {
            result = a / b;
        }
        catch (Exception e){

        System.out.println("EXCEPTION occurred "+e);
        }
        finally {
            System.out.println("THIS IS FINALLY BLOCK AND EXECUTES EVERYTIME");
        }

        System.out.println("after calculation");

        return result;

    }
     //2.
    public void display() {


        int arr[] = {4, 5, 3, 2, 6};
        System.out.println("BEFORE calculation");
        try {

            System.out.println(arr[5]);
        }
        catch (Exception e) {

            System.out.println("EXCEPTION occurred "+e);
        }
        finally {
            System.out.println("THIS IS FINALLY BLOCK AND EXECUTES EVERYTIME");
        }
            System.out.println("after caculation");


    }
    public static void main(String[] args) {

        Demo obj=new Demo();
        System.out.println("BEFORE calling");
     int result= obj.divide(8,0);

     System.out.println("Output IS "+result);

     //2.
     obj.display();
    }
}
