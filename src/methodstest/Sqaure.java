package methodstest;

public class Sqaure {
    public void square() {
        for (int i = 1; i <= 10; i++) {
            int sq = i * i;
            System.out.println("Square of " + i + " is: " + sq);
        }
    }

    public static void main(String[] args) {
        Sqaure sqaure = new Sqaure();
        sqaure.square();


    }
}
