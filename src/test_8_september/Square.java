package test_8_september;

public class Square {

    public void checkSquare() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square of " + i + " is: " + (i * i));
        }
    }

    public static void main(String[] args) {
        Square obj = new Square();
        obj.checkSquare();
    }


}
