package test_8_september;

public class Check_Cube {

    public void CheckCubeNumber() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("cube " + i + "is:" + (i * i * i));
        }
    }

    public static void main(String[] args) {
        Check_Cube obj4 = new Check_Cube();

        obj4.CheckCubeNumber();
    }
}
