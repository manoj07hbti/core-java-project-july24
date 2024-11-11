package oops.abstraction.abstrac;

import model.Student;

public class School1 extends StudentManagement{
    @Override
    public void payfee() {
        System.out.println("This is Payfee Method");
    }

    @Override
    public void displayResult() {
        System.out.println("This is displayResult Method");


    }

    public static void main(String[] args) {
        School1 obj=new School1();
        obj.addStudent();
        obj.displayResult();
        obj.payfee();
    }

}
