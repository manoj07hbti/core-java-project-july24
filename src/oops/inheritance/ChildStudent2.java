package oops.inheritance;

public class ChildStudent2 extends StudentManagment {
    @Override
    public void payfee() {
        System.out.println("this is fee payment charter...");

    }

    @Override
    public void displayResult() {
        System.out.println("this is fee payment charter...");
        System.out.println("this display result data....");
    }

    public static void main(String[] args) {
ChildStudent2 obj = new ChildStudent2();

        obj.addStudent();
        obj.payfee();
        obj.displayResult();

    }
}