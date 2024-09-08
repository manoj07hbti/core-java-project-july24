package test_8_sep;

public class ElevenDivision {

    //7)write a code to check any number between 8 to 160 is divisible by 11v
    //and it should not be odd number

    public String eleven(int n){
        String result = " ";
        for (int i = 8; i <= 160; i++) {
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
        ElevenDivision obj = new ElevenDivision();
        System.out.println(obj.eleven(110));
        System.out.println(obj.eleven(123));
    }
}
