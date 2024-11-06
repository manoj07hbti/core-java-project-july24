package exception;

public class LessAmountException extends Exception{

    public LessAmountException(String message) {
        super(message);
    }
}


/*
STEP 1 : create a class and extend it from Exception
because we want to inherit behaviour and methods of Excepetion
STEP 2 : override constructor with String message

 We will have our exception ready.

STEP 3 :use throw
throw keyword : it is used to throw an Exception programmetically

SYNTAX:  throw ExceptionName("msg");
throw new AgeNotEligibleException("message");

STEP 4:  throws
throws : it is used to declare an exception at method level

  method () throws ExceptionName{

  }
 */