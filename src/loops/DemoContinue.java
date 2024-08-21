package loops;

public class DemoContinue {

    public static void main(String[] args) {

        int marks[] = {34, 56, 78, 23, 54, 78, 90, 77, 85};

        // we want to print only >=60

        for (int var : marks) {

            if (var < 60) {
                continue;
            }

            System.out.println("First Division marks : " + var);

        }

    }
}
