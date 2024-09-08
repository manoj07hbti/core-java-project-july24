package test_8_september;

public class Square {

    public void CheckSquare() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Square" + i + "is:" + (i * i));
        }
    }

    public static void main(String[] args) {
        Square obj5 = new Square();
        obj5.CheckSquare();
    }
}
