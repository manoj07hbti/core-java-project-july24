package test_25_august;

public class Find_Maximum_Element {

    public static void main(String[] args) {


        int maximum[] = {1, 3, 5, 2, 4};
        int i = 0;
        for (int num : maximum) {
            if (num == 5) {
                System.out.println("FIND 5 ELEMENT..." + i);
                i++;
            }
        }
    }
}
