package methods;

public class Cube {
    int i=6;
    public void square(){
        System.out.println("Square: "+i*i);
    }
    public void cube(){
        System.out.println("Cube: "+i*i*i);
    }

    public static void main(String[] args) {
        Cube sc=new Cube();
        sc.square();
        sc.cube();
    }
}
