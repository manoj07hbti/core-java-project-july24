package methods;

public class Engineer {

    public void construct(){
        System.out.println("ENGINEER:CONSTRUCT FRAMEWORK");
    }

    public void design(){
        System.out.println("ENGINEER:DESIGN");
    }

    public void innovate(){
        System.out.println("ENGINEER:INNOVATE");
    }

    public static void main(String[] args) {

        Engineer e1 = new Engineer();
        e1.construct();
        e1.design();
        e1.innovate();
    }
}
