package array;

public class ArrayDoubleClass {

    public static void main(String[] args) {

        double height[] = {4.5,4.8, 5.1, 5.5, 6.2};
        System.out.println("heights:"+height[3]);

        //1)for loop
        for (int i = 0; i < height.length; i++) {
            System.out.println("WEIGHT BY FOR LOOP:" + height[i]);
        }

        //2)while loop
        int i = 0;
        while (i < height.length) {
            System.out.println("WEIGHT BY WHILE LOOP:" + height[i]);
            i++;

        }

        //3)advance loop
        for (double var : height) {
            System.out.println("WEIGHT BY ADVANCE LOOP:" + var);
        }

    }
}
