package exception;

public class Interview {


    public void interview() {


        // TODO Q1: CAN WE HAVE TRY BLOCK WITHOUT CATCH BLOCK ?
        //TODO ANS: NO,EVERY TRY BLOCK SHOULD HAVE AT LEAST  ONE CATCH OR FINALLY BLOCK.

        try {
            System.out.println("Test");

        }
        catch (Exception e) {

        }

        //TODO Q2: CAN WE HAVE MULTIPLE CATCH BLOCK IN SINGLE TRY BLOCK ?
        //TODO ANS: YES , WE NEED TO MANTAIN HIRERACHY OF EXCEPTION CHILD CLASS EXCEPTION WILL BE COUGHT FIRST AND THEN PARENT

        try {

        }
        catch (RuntimeException e) {

        }
        catch (Exception e) {

        }


        //TODO: Q3: can finally block skip ? or Is there any possibility where finally block will not execute
        //TODO: YES,  System.exit(1);


        try {

            System.out.println("Test of finally block");

            System.exit(1);
        }
        catch (Exception e) {

        }
        finally {
            System.out.println("THIS IS FINALLY");
        }


    }

    public static void main(String[] args) {

        Interview obj=new Interview();
        obj.interview();
    }
}