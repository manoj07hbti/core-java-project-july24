package methods;

public class Engineer {

    String name;
    int age;
    String branch;
    String city;

    // Methods design, eat, sleep

    private void design() {
        System.out.println("This is design method of engineer...");
    }

    public void eat() {
        System.out.println("This is eat method of engineer...");
    }

    private void sleep() {
        System.out.println("This is sleep method of engineer....");
    }

    public static void main(String[] args) {
        Engineer eng = new Engineer();
        eng.design();
        eng.eat();
        eng.sleep();
    }

}
