package test_25_august;

public class EvenAndOddElements {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};

        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("count of even number in an array:" + even);
        System.out.println("count of odd number in an array:" + odd);
    }
}






