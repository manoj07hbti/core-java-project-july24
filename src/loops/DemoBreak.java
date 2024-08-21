package loops;

public class DemoBreak {

    public static void main(String[] args) {

        // you have an array of cities , whenever you find city as AGRA you need stop execution

        String cities[] = {"Jaipur", "Pune", "Agra", "Delhi", "Mumbai"};

        int i = 0;
        for (String var : cities) {

            if (var == "Agra") {
                // we need to exit
                System.out.println("Found Agra at index: " + i + " hence ending the loop...");

                break;

            }
            i++;
            System.out.println("Printing using advanced for loop..." + var);
        }


        double price[] = {34.5, 76.4, 56.78, 49.55, 56.7};

        int j = 4;
        for (double var : price) {
            if (j < 0) {
                break;
            }

            System.out.println("Printing : " + price[j] + " At Index: " + j);
            j--;

        }

    }
}
