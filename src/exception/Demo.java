package exception;

public class Demo {

    public int divide(int a, int b) {
        System.out.println("before calculation");
        int result = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("Exception occurred " + e);
        } finally {
            System.out.println("Finally block executes everytime whether exception occurred or not");
        }
        System.out.println("After calculation");
        return result;
    }

    public void display() {
        System.out.println("Before printing");
        int arr[] = {3, 4, 5, 6, 7};
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Exception occurred " + e);
        }
        System.out.println("After printing");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Before calling");
        int result = obj.divide(4, 0);
        System.out.println("After calculation " + result);

        obj.display();
    }


}
