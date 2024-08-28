package demo_arrey;

public class Binary_Search {


    public static void main(String[] args) {

        int array[] = {2, 4, 5, 7, 8, 9, 10, 20, 30, 40, 60, 70};
        int element = 70;

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] == element) {
                System.out.println("given number has found at posion" + middle);
                return;
            } else if (array[middle] < element) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

    }
}
