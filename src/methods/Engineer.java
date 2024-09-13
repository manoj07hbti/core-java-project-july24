package methods;

public class Engineer {
    public void sleep(){
        System.out.println("This is Sleep method of engineer");
    }
    private void eat(){
        System.out.println("This is eat method of engineer");
    }
    public void work(){
        System.out.println("This is work method of engineer");
    }

    public static void main(String[] args) {
        Engineer eng=new Engineer();
        eng.eat();
        eng.sleep();
        eng.work();
    }
}
