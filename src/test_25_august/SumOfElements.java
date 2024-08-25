package test_25_august;

public class SumOfElements {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};

        int add = 0;

        for (int i = 0; i < array.length; i++) {

            add += array[i];
        }
        System.out.println("sum of all element:" + add);
    }
}
