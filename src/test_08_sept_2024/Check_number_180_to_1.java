package test_08_sept_2024;

public class Check_number_180_to_1 {


    public void newNumber() {
        for (int i = 180; i >= 1; i--) {
            if (i % 11 != 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        Check_number_180_to_1 obj = new Check_number_180_to_1();

           obj.newNumber();



    }
}