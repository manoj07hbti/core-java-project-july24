package methods;

public class Docter {


    String name;
    int age;
    String degree;

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
       public static void main(String [] args){

      Docter doc1 = new Docter();

     // obj name . methodname ();
           doc1.work();
           doc1.eat();
           doc1.sleep();




       }

    }


