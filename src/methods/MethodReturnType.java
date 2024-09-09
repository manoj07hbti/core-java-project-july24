package methods;

public class MethodReturnType {

//SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}


    // write a method which will sun of given number 75+25=100

    public int sum(int a, int b) {
        int sun = a + b;
        return sun;
    }

    public static void main(String[] args) {
        MethodReturnType obj = new MethodReturnType();
        int result = obj.sum(25, 100);
        System.out.println(result);

    }




}
