package test_8_september;

public class Methods {
    //write a check any number between 5 to150 divisible by 3 even number
    public void checkNumber() {
        int number = 150;
        for (int i = 5; i <= 150; i++) {
            if (i % 3 == 0 && i % 2 != 0) {

                System.out.println("even number.." + i);
            }
        }


    }


    public static void main(String[] args) {

        Methods obj = new Methods();
        obj.checkNumber();


    }
}