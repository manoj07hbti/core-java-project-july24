package methods;

public class Doctor {

    String name;
    int age;
    String speciality;
    String degree;
    String designation;

    // Methods   work, eat, sleep

    private void work() {
        System.out.println("This is work method of doctor...");
    }

    public void eat() {
        System.out.println("This is eat method of doctor");
    }

    private void sleep() {
        System.out.println("This is sleep method of doctor..");
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.work();
        doc.eat();
        doc.sleep();
    }

}
