package oops.abstraction.abstrac;

public class School2 extends StudentManagement{
    @Override
    public void payfee() {
        System.out.println("This is Payfee Method");

    }

    @Override
    public void displayResult() {
        System.out.println("This is displayResult Method");

    }

    public static void main(String[] args) {
        School2 obj=new School2();
        obj.addStudent();
        obj.displayResult();
        obj.payfee();
    }
}
