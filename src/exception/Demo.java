package exception;

public class Demo {

    public int divide(int a, int b){

        System.out.println("Before calculation");
        int result=0;
        try {
             result = a / b;
        }
        catch (Exception e){
            System.out.println("Exception occurred "+e);
        }
        finally {
            System.out.println("THIS IS FINALLY BLOCK AND EXECUTES EVERYTIME");
        }
        System.out.println("After calculation");
        return result;
    }

    public void display(){
        int arr[]={3,4,5,6,7};
        System.out.println("Before printing");
        try {
            System.out.println(arr[4]);
        }
        catch (Exception e){
            System.out.println("Exception occurred "+e);
        }
        finally {
            System.out.println("THIS IS FINALLY BLOCK AND EXECUTES EVERYTIME");
        }
        System.out.println("After printing");

    }

    public void interview(){
//TODO Q1: CAN WE HAVE TRY BLOCK WITHOUT CATCH BLOCK ?
//TODO ANS: NO, EVERY TRY BLOCK SHOULD HAVE AT LEAST ONE CATCH OR FINALLY BLOCK
        try{
            System.out.println("Test");
        }
        catch (Exception e){

        }
//TODO Q2: CAN WE HAVE MULTIPLE CATCH BLOCK IN SINGLE TRY BLOCK ?
//TODO ANS: YES , WE NEED TO MANTAIN HIRERACHY OF EXCEPTION CHILD CLASS EXCEPTION WILL BE COUGHT FIRST AND THEN PARENT
        try{

        }
        catch (RuntimeException e){

        }
        catch (Exception e){

        }
//TODO: Q3: can finally block skip ? or Is there any possibility where finally block will not execute
//TODO: YES,  System.exit(1);

        try{
            System.out.println("Test of finally block");
            System.exit(1);
        }
        catch (Exception e){

        }
        finally {
            System.out.println("This is finally");
        }

    }

    public static void main(String[] args) {

        Demo obj = new Demo();
        System.out.println("Before calling");
        int result=obj.divide(4,0);
        System.out.println("Output is "+result);

        obj.display();
        obj.interview();
    }

}
