package test_8_sep;

public class SevenDivisible {

    //2)wrtie a code for divisible by 7 between 7 to 190 and
    //not odd

    public String seven(int n) {
        String result = " ";
        for (int i = 7; i <= 190; i++) {
            if (!(n % 3 == 0)) {
                if (n % 7 == 0) {
                    result = "divisible by 7:" + n;
                } else {
                    result = "not divisible by 7:" + n;
                }
            } else {
                result = "number is odd number:" + n;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SevenDivisible obj = new SevenDivisible();
        System.out.println(obj.seven(14));
        System.out.println(obj.seven(16));
        System.out.println(obj.seven(7));
    }
}
