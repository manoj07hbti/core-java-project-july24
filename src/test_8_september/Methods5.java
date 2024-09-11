package test_8_september;

public class Methods5 {

    public void checkNumber() {
        int no = 180;
        for (int i = 1; i <= 180; i++) {
             if( (i % 11 ==0) &&( i%2 == 0)) {
                System.out.println("number"+i);
            }
        }

    }


    public static void main(String[] args) {
        Methods5 obj=new Methods5();
        obj.checkNumber();
    }
}



