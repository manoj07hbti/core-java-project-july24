package test_8_sep;

public class NineDivisible {


    //3)write a code for divisible by 9
    //and is not odd

    public String nine(int n){
        String result = " ";
        for (int i = 3; i <= 160; i++) {
            if (n % 2 == 0) {
                if ((n%6==0)  || (n % 3 == 0)  || (n%9==0)){
                    result = "divisible by 9:" + n;
                } else {
                    result = "not divisible by 9:" + n;
                }
            } else {
                result = "number is odd number:" + n;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NineDivisible obj = new NineDivisible();
        System.out.println(obj.nine(18));
        System.out.println(obj.nine(73));
    }
}
