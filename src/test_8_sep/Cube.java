package test_8_sep;

public class Cube {

    //10)write a code to print cube of number starting from 1 to 10

    public String cube(int n) {
        String result = " ";
        for ( n= 1; n <= 10; n++) {
            result="cube of"+n+"is:"+n*n*n;
        }
        return result;
    }
    public static void main(String[] args) {
        Cube obj = new Cube();
        System.out.println(obj.cube(2));
        }
}
