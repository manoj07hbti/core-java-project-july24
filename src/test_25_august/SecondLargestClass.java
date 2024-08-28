package test_25_august;

public class SecondLargestClass {

    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5};

        int temp;
        for(int i=0; i<num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("second largest number is:"+num[1]);
        }
    }