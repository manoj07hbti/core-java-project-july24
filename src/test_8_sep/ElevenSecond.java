package test_8_sep;

public class ElevenSecond {

    //8)write a code to check any number between 180 to 1 is divisible by 11
    //and it should not be odd number

    public String reveleven(int n){
        String result = " ";
        for (int i = 180; i>=1; i--) {
            if (n % 2 == 0) {
                if (n % 11 == 0) {
                    result = "divisible by 11:" + n;
                } else {
                    result = "not divisible by 11:" + n;
                }
            } else {
                result = "number is odd number:" + n;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ElevenSecond obj = new ElevenSecond();
        System.out.println(obj.reveleven(145));
    }
}
