package test_8_september;

public class Check_number180to1 {

    public void CheckNumber(){

        for (int i=180; i>=1; i--){

            if (i % 11 !=0 && i%2==0){
                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {

        Check_number180to1 obj= new Check_number180to1();

        obj.CheckNumber();

    }

}
