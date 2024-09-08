package test_8_september;

public class CheckNumber8To160 {

    // write a code to check number b/w 8 to 160 divisible by 11 and it should be not an odd number

    public void checkNumber(){
        for(int i=8; i<=160;i++){
            if(i%11!=0 && i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        CheckNumber8To160 obj =new CheckNumber8To160();
        obj.checkNumber();
    }
}
