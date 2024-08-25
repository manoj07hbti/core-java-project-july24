package test_25_august;

public class BinarySearch {

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int target = 40;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;                // mid=50

            if (array[mid] == target) {               // 50==40
                System.out.println("the number is found at index:" + mid);
                break;
            } else if (array[mid] < target) {            // 50<40
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("the number is not found at any index");


    }
}



