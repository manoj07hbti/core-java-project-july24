package exception;

public class AgeNotEligible extends Exception{
    public AgeNotEligible(String message) {
        super(message);// it points to parent class
    }
}
