package test_8_september;

public class CheckNumber8to160 {

public void CheckNumber(){

    for (int i=8; i<=160; i++){

        if (i % 11 !=0 && i % 2==0){
            System.out.println(i);
        }
    }
}

    public static void main(String[] args) {
        CheckNumber8to160 obj2= new CheckNumber8to160();

        obj2.CheckNumber();
    }
}
