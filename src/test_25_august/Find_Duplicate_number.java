package test_25_august;

public class Find_Duplicate_number {


    public static void main(String[] args) {

        int mann[] = {1, 2, 3, 4, 2, 3, 5};

        for (int m = 0; m < mann.length - 1; m++) {
            System.out.println("find duplicate " + mann[m]);

            for (int h = m + 1; h < mann.length; m++) {
                if (mann[m] == mann[h]) {
                    System.out.println("find duplicate" + mann[m]);
                }
            }


        }
    }
}
