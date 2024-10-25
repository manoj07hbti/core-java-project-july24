package oops.inheritance;

import model.Students;

public class ChildSchool1 extends StudentManagment {


    @Override
    public void payfee() {
        System.out.println("this is fee payment charter...");

    }

    @Override
    public void displayResult() {
        System.out.println("this display result data....");

    }

    public static void main(String[] args) {
        ChildSchool1 obj = new ChildSchool1();
       obj.addStudent();
       obj.payfee();
       obj.displayResult();

    }
}
