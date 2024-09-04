package methods;

public class CubeInput {
    public void cube(int number){
        System.out.println(number*number*number);
    }

    public static void main(String[] args) {
        CubeInput c=new CubeInput();
        c.cube(3);
        c.cube(5);
        c.cube(7);
    }
}
