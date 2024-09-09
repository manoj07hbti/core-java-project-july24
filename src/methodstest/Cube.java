package methodstest;

public class Cube {
    public void cube() {
        for (int i = 1; i <= 10; i++) {
            int sq = i * i * i;
            System.out.println("Cube of " + i + " is: " + sq);
        }
    }

    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.cube();
    }

}
