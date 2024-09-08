package test_8_september;

public class CheckNumber5to150 {

    public void CheckNumber() {

        for (int i = 5; i <= 150; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        CheckNumber5to150 obj3 = new CheckNumber5to150();
        obj3.CheckNumber();
    }


}


